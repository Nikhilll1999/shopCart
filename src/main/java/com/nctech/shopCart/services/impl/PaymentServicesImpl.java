package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.Payment;
import com.nctech.shopCart.repository.PaymentRepo;
import com.nctech.shopCart.services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServicesImpl implements PaymentServices {
    @Autowired
    PaymentRepo paymentRepo;
    @Override
    public void save(Payment payment) {
        paymentRepo.save(payment);
    }

    @Override
    public void update(Payment payment) {
     paymentRepo.save(payment);
    }

    @Override
    public Payment findById(Integer id) {
        return paymentRepo.findById(id).orElse(new Payment());
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
      paymentRepo.deleteById(id);
    }
}
