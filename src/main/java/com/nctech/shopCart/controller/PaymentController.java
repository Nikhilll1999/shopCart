package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.Payment;
import com.nctech.shopCart.services.PaymentServices;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
   private PaymentServices paymentServices;
    @PostMapping("/")
    public void save(@RequestBody Payment payment){
        paymentServices.save(payment);
    }
    @PutMapping("/")
    public void update(@RequestBody Payment payment){
        paymentServices.update(payment);
    }
    @GetMapping("{id}")
    public Payment findById(@PathVariable Integer id){
        return paymentServices.findById(id);
    }
    @GetMapping("/")
    public List<Payment>findAll(){
       return paymentServices.findAll();
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        paymentServices.delete(id);
    }
}
