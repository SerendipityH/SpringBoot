package com.serendipity;

import javax.servlet.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.serendipity.servlet.SecondServlet;

/**
 * 
 * @author gqh
 *
 */
@SpringBootApplication
public class App2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(App2.class, args);
    }

    @Bean
    public ServletRegistrationBean<Servlet> getServletRegistrationBean() {
        ServletRegistrationBean<Servlet> bean =
                new ServletRegistrationBean<Servlet>(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

}
