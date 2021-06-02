package com.serendipity.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {
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
