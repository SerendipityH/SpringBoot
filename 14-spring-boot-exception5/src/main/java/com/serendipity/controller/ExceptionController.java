package com.serendipity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
/**
 * SpringBoot处理异常方式一，自定义错误页面
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {

    @RequestMapping("/show")
    public String showInfo() {
        String string = null;
        string.length();
        return "index";
    }
    
    @RequestMapping("/show2")
    public String showInfo2() {
        int a=10/0;
        return "index";
    }
    
   
}
