package com.hellokoding.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.SpringBootServletInitializer;

@SpringBootApplication
//public class WebApplication extends SpringBootServletInitializer {
public class WebApplication  {
   // @Override
    //protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
     //   return application.sources(WebApplication.class);
    //}

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
    }
}
