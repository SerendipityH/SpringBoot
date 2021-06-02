package com.serendipity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringBoot HelloWorld
 * @author gqh
 *
 */
@Controller
public class HelloWorld {
    
    @RequestMapping("/hello")
    @ResponseBody
    public String show() {
        return "Hello World";
    }
}
