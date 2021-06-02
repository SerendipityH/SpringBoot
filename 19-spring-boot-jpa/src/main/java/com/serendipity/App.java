package com.serendipity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(App.class, args);

    }

}
