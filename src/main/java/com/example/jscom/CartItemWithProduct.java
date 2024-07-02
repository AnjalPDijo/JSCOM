package com.example.jscom;

public  class CartItemWithProduct {
        private CartItem cartItem;
        private Product product;

        public CartItemWithProduct(CartItem cartItem, Product product) {
            this.cartItem = cartItem;
            this.product = product;
        }

        public CartItem getCartItem() {
            return cartItem;
        }

        public Product getProduct() {
            return product;
        }
    }