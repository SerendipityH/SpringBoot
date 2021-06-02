package com.serendipity.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.serendipity.pojo.Users;

/**
 * 
 * @author gqh
 *
 */
@Controller
public class DemoController {

    @RequestMapping("/show")
    public String showInfo(Model model) {
        model.addAttribute("msg", "Thymeleaf 第一个案例");
        model.addAttribute("key", new Date());
        return "index";
    }

    @RequestMapping("/show2")
    public String showInfo2(Model model) {
        model.addAttribute("sex", "男");
        model.addAttribute("id", "2");
        return "index2";
    }

    @RequestMapping("/show3")
    public String showInfo3(Model model) {
        List<Users> list = new ArrayList<Users>();
        list.add(new Users(1, "张三", 20));
        list.add(new Users(2, "李四", 10));
        list.add(new Users(3, "王五", 30));
        model.addAttribute("list", list);
        return "index3";
    }

    @RequestMapping("/show4")
    public String showInfo4(Model model, HttpServletRequest request) {
        request.setAttribute("req", "HttpServletRequest");
        request.getSession().setAttribute("sess", "HttpSession");
        request.getSession().getServletContext().setAttribute("app", "Application");
        return "index4";
    }
}
