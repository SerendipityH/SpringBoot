package com.serendipity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
/**
 * SpringBoot整合Filter方式一
 * @author gqh
 *
 */
@SpringBootApplication
@ServletComponentScan // 在SpringBoot启动时会扫描
public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(App.class, args);
    }

}

