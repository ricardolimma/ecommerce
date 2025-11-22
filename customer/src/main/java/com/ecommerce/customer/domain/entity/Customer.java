package com.ecommerce.customer.domain.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Customer {
    private final String id;
    private final String name;
    private final String email;

    public Customer(String name, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
    }
}
