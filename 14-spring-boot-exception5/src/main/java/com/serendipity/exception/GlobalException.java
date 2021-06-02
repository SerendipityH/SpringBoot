package com.serendipity.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Configuration
public class GlobalException {
    /**
     * 该方法有返回值
     */
    @Bean
   public SimpleMappingExceptionResolver getExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        
        Properties mappings=new Properties();
        /**
         * 参数一：异常的类型，必须是异常类型的全名
         * 参数二：视图名称
         */
        mappings.put("java.lang.ArithmeticException", "error2");
        mappings.put("java.lang.NullPointerException", "error3");
        //设置异常与视图映射信息的
        resolver.setExceptionMappings(mappings);
    
        return resolver;
    }
}
