package com.nctech.shopCart.controller;

import com.nctech.shopCart.config.AppConfig;
import com.nctech.shopCart.dto.Login;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginControllerTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    LoginController loginController = context.getBean(LoginController.class);
   @Order(1)
   @Test
   public void testSave() {
        Login login = new Login(1, "XYZ", "JHK", "NIKHIL");
        loginController.save(login);
        System.out.println("Login Details saved Successfully");
    }
    @Order(2)
    @Test
    public void testUpdate() {
        Login login = new Login(2, "Bunty", "Bunny", "Ingle");
        loginController.update(login);
        System.out.println("Update successfully");
    }
    @Order(3)
     @Test
    public void testFindById() {
        Login login = loginController.findById(2);
        System.out.println(login.getId());
        System.out.println(login.getUserName());
        System.out.println(login.getPassword());
        System.out.println(login.getFullName());
    }
    @Order(4)
    @Test
    public void testFindAll(){
        List<Login> logins = loginController.findAll();
        logins.forEach(login -> System.out.println(login.getId()+"|"+login.getUserName()+"|"+login.getPassword()+"|"+login.getFullName()));
    }
   @Order(5)
   @Test
   public void testDelete(){
     loginController.delete(1);
      System.out.println("Deleted Successfully");
   }
}
