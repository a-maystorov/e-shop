package com.mygroup.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShopApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ShopApplication.class, args);
        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "alkin@codewithalkin.com", "12345", "Alkin"));
        userService.registerUser(new User(1L, "alkin@codewithalkin.com", "12345", "Alkin"));
    }
}
