package com.nctech.shopCart.repository;

import com.nctech.shopCart.dto.User;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserRepositoryTest {
    UserRepo userRepo = new UserRepoImpl();

    @Order(1)
    @Test
    public void testSave() {
        User user = new User(4, "Funky", "Fun", "Funky Ingle");
        userRepo.save(user);
        System.out.println("User saved successfully");
    }

    @Order(2)
    @Test
    public void testFindById() {
        User user = userRepo.findById(2);
        System.out.println(user.getId());
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getFullName());
    }
    @Order(3)
    @Test
    public void testUpdate(){
        User user = new User(3,"Nunty","Nun","Nunty");
        userRepo.update(user);
        System.out.println("User updated successfully");
    }
    @Order(4)
    @Test
    public void testFindAll(){
        List<User> users = userRepo.findAll();
        users.forEach(user -> System.out.println(user.getId()+"|"+user.getUserName()+"|"+user.getPassword()+"|"+user.getFullName()));
    }
    @Order(5)
    @Test
    public void testDelete(){
        userRepo.delete(2);
        System.out.println("User deleted successfully");
    }
}
