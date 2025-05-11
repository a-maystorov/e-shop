package com.mygroup.shop;

import com.mygroup.shop.entities.Address;
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

        var address = Address.builder()
                .street("street")
                .city("city")
                .state("state")
                .zip("zip")
                .build();

        user.addAddress(address);
        System.out.println(user);
    }
}
