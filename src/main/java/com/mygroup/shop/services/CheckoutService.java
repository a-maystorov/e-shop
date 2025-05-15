package com.mygroup.shop.services;

import com.mygroup.shop.dtos.CheckoutRequest;
import com.mygroup.shop.dtos.CheckoutResponse;
import com.mygroup.shop.entities.Order;
import com.mygroup.shop.exceptions.CartEmptyException;
import com.mygroup.shop.exceptions.CartNotFoundException;
import com.mygroup.shop.repositories.CartRepository;
import com.mygroup.shop.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CheckoutService {
    private final CartRepository cartRepository;
    private final OrderRepository orderRepository;
    private final AuthService authService;
    private final CartService cartService;

    public CheckoutResponse checkout(CheckoutRequest request) {
        var cart = cartRepository.getCartWithItems(request.getCartId()).orElse(null);
        if (cart == null) {
            throw new CartNotFoundException();
        }

        if (cart.isEmpty()) {
            throw new CartEmptyException();
        }

        var order = Order.fromCart(cart, authService.getCurrentUser());

        orderRepository.save(order);

        cartService.clearCart(cart.getId());

        return new CheckoutResponse(order.getId());
    }
}
