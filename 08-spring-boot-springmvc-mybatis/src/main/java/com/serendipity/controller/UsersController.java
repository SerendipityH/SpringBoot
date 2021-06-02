package com.serendipity.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.serendipity.pojo.Users;
import com.serendipity.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;
    /**
          * 页面跳转
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
    
    /**
     *     添加用户
     */
    
    @RequestMapping("/addUser")
    public String addUser(Users users) {
        usersService.addUser(users);
        return "ok";
    }
    
    /**
     * 查询用户
     */
    @RequestMapping("findAllUsers")
    public String findAllUsers(Model model){
        List<Users> list=usersService.findAllUsers();
        model.addAttribute("list", list);
        return "showUsers";
    }
    
    /**
     * 根据用户id查询用户
     */
    @RequestMapping("/findUserById")
    public String findUserById(Integer id,Model model) {
        Users user = usersService.findUserById(id);
        model.addAttribute("user",user);
        return "updateUser";
    }
    
    /**
     * 更新用户
     */
    
    @RequestMapping("/editUser")
    public String editUser(Users user) {
        usersService.updateUser(user);
        return "ok";
    }
    
    /**
     * 删除用户
     */
    @RequestMapping("/deleteUser")
    public String delUser(Integer id) {
        usersService.deleteUserById(id);
        return "redirect:/users/findAllUsers";
    }

    @Scheduled(cron="0/1 * * * * ?")
    public void scheduledMethod() {
        List<Users> list=usersService.findAllUsers();
        for (Users user:list){
            System.out.println(user.toString()+new Date());
        }

    }
}
