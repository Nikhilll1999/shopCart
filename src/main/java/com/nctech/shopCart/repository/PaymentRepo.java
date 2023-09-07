package com.nctech.shopCart.repository;

import com.nctech.shopCart.dto.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PaymentRepo extends JpaRepository<Payment,Integer> {

}
