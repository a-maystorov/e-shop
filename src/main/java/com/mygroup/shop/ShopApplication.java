package com.mygroup.shop;

import com.mygroup.shop.entities.User;
import com.mygroup.shop.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShopApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ShopApplication.class, args);
        var repository = context.getBean(UserRepository.class);

        var user = User.builder()
                .name("John")
                .email("john@example.com")
                .password("password")
                .build();

        repository.save(user);
    }
}
