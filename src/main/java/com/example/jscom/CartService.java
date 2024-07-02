package com.example.jscom;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public void addToCart(Long productId) {
        CartItem cartItem = new CartItem();
        cartItem.setProductId(productId);
        cartItemRepository.save(cartItem);
    }
}
