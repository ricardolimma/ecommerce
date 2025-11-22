package com.ecommerce.customer.domain.repository;

import com.ecommerce.customer.domain.entity.Customer;

public interface CustomerRepository {
    Customer save(Customer customer);
}
