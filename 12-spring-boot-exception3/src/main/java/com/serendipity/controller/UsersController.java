package com.serendipity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
    @RequestMapping("/showUsers")
    public String showUser(){
        String string = null;
        string.length();
        return "index";
    }
}
