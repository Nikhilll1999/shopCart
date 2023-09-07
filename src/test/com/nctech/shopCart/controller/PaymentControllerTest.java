package com.nctech.shopCart.controller;

import com.nctech.shopCart.config.AppConfig;
import com.nctech.shopCart.dto.Payment;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PaymentControllerTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    PaymentController paymentController = context.getBean(PaymentController.class);
    @Order(1)
    @Test
    public void testSave(){
        Payment payment = new Payment(106,"500","500",1300.00,"ONLINE");
        paymentController.save(payment);
        System.out.println("Payment saved successfully");
    }
    @Order(2)
    @Test
    public void testUpdate(){
        Payment payment = new Payment(102,"500","1000",500.00,"ONLINE");
        paymentController.update(payment);
        System.out.println("Payment updated successfully");
    }
    @Order(3)
    @Test
    public void testFindById(){
        Payment payment = paymentController.findById(102);
        System.out.println(payment.getId());
        System.out.println(payment.getPaymentId());
        System.out.println(payment.getOrderId());
        System.out.println(payment.getAmount());
        System.out.println(payment.getPaymentMethod());
    }
    @Order(4)
    @Test
    public void testFindAll(){
   List<Payment> paymentList = paymentController.findAll();
   paymentList.forEach(payment -> System.out.println(payment.getId()+"|"+payment.getAmount()+"|"+payment.getPaymentMethod()));
    }
    @Order(5)
    @Test
    public void testDelete(){
        paymentController.delete(101);
        System.out.println("Payment deleted successfully");
    }


}
