package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.Payment;

import java.util.List;

public interface PaymentServices {
    void save(Payment payment);
    void update(Payment payment);
    Payment findById(Integer id);
    List<Payment> findAll();
    void delete(Integer id);
}
