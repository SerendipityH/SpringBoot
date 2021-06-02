package com.serendipity.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.serendipity.pojo.Users;

@Controller
@RequestMapping("/users")
public class UsersController {
    
    @RequestMapping("/addUser")
    public String showPage() {
        return "add";
    }
    
    @RequestMapping("/save")
    public String saveUser(@Valid Users users,BindingResult result) {
        if(result.hasErrors()) {
            return "add";
        }
        System.out.println(users);
        return "ok";
    }
    
}
