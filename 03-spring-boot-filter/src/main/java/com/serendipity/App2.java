package com.serendipity;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

import com.serendipity.filter.SecondFilter;
import com.serendipity.servlet.FirstServlet;

/**
 * SpringBoot整合Filter方式二
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
    /**
         * 注册Filter
     */
    public FilterRegistrationBean<Filter> getFilterRegistrationBean(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<Filter>(new SecondFilter());
        //bean.addUrlPatterns(new String[] {"*.do","*.jsp"});
        bean.addUrlPatterns("/first");
        return bean;
    }

}
