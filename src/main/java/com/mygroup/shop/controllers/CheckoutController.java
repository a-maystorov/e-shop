package com.mygroup.shop.controllers;

import com.mygroup.shop.dtos.CheckoutRequest;
import com.mygroup.shop.dtos.CheckoutResponse;
import com.mygroup.shop.dtos.ErrorDto;
import com.mygroup.shop.exceptions.CartEmptyException;
import com.mygroup.shop.exceptions.CartNotFoundException;
import com.mygroup.shop.services.CheckoutService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/checkout")
public class CheckoutController {
    private final CheckoutService checkoutService;

    @PostMapping
    public CheckoutResponse checkout(@Valid @RequestBody CheckoutRequest request) {
        return checkoutService.checkout(request);
    }

    @ExceptionHandler({CartNotFoundException.class, CartEmptyException.class})
    public ResponseEntity<ErrorDto> handleException(Exception ex) {
        return ResponseEntity.badRequest().body(new ErrorDto(ex.getMessage()));
    }
}
