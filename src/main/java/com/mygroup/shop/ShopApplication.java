package com.mygroup.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShopApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ShopApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
        var notificationManager = context.getBean(NotificationManager.class);
        notificationManager.sendNotification("Hello, this is a test");
    }
}
