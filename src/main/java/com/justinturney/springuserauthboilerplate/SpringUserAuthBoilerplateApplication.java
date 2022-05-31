package com.justinturney.springuserauthboilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SpringUserAuthBoilerplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringUserAuthBoilerplateApplication.class, args);
    }

}
