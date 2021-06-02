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
    
    /**
     * 
     * @param e 会将产生的异常对象注入到方法中
     * @return
     */
    @ExceptionHandler(value= {java.lang.ArithmeticException.class})
    public ModelAndView ArithmeticExceptionHandler(Exception e) {
            ModelAndView mv = new ModelAndView();
            mv.addObject("error",e.toString());
            mv.setViewName("error2");
            return mv;
    }
    
    
    
    /**
     * 
     * @param e 会将产生的异常对象注入到方法中
     * @return
     */
    @ExceptionHandler(value= {java.lang.NullPointerException.class})
    public ModelAndView NullPointerExceptionHandler(Exception e) {
            ModelAndView mv = new ModelAndView();
            mv.addObject("error",e.toString());
            mv.setViewName("error3");
            return mv;
    }
}
