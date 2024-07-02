package com.example.jscom;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    public void setProductId(Long id){
        this.productId=id;
    }

    public Long getProductId()
    {
        return this.productId;
    }

}
