package com.mygroup.shop;

import com.mygroup.shop.entities.Tag;
import com.mygroup.shop.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {
    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(ShopApplication.class, args);
        var user = User.builder()
                .name("John")
                .email("john@example.com")
                .password("password")
                .build();

        var tag1 = new Tag("tag1");
        var tag2 = new Tag("tag2");

        user.addTag(tag1);
        user.addTag(tag2);

        System.out.println("Before removal: " + user);

        user.removeTag(tag1);

        System.out.println("After removal: " + user);
    }
}
