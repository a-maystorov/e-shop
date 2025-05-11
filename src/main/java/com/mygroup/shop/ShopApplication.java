package com.mygroup.shop;

import com.mygroup.shop.entities.Profile;
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

        var profile = Profile.builder().bio("bio").build();

        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);
    }
}
