package com.mygroup.shop;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

    public static void main(String[] args) {
//		SpringApplication.run(ShopApplication.class, args);
        var orderService = new OrderService(new PayPalPaymentService());
        orderService.placeOrder();
    }
}
