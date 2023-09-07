package com.nctech.shopCart.controller;

import com.nctech.shopCart.config.AppConfig;
import com.nctech.shopCart.dto.User;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class UserControllerTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    UserController userController = context.getBean(UserController.class);
    @Order(1)
    @Test
    public void testSave(){
        User user = new User (2,"Krish","Kri","Krishna");
        userController.save(user);
        System.out.println("User saved successfully");
    }
    @Order(2)
    @Test
    public void testFindById(){
        User user = userController.findById(1);
        System.out.println(user.getId());
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getFullName());
    }
    @Order(3)
    @Test
    public void testUpdate(){
        User user = new User(1,"Pink","P","nik");
        userController.update(user);
        System.out.println("User Update successfully");
    }
    @Order(4)
    @Test
    public void testFindAll(){
        List<User> users = userController.findAll();
        users.forEach(user -> System.out.println(user.getId()+"|"+user.getUserName()+"|"+user.getPassword()+"|"+user.getFullName()));
    }
    @Order(5)
    @Test
    public void testDelete(){
        userController.delete(3);
        System.out.println("User deleted successfully");
    }

}
