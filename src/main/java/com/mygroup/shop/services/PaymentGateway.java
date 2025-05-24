package com.mygroup.shop.services;

import com.mygroup.shop.entities.Order;

public interface PaymentGateway {
    CheckoutSession createCheckoutSession(Order order);
}
