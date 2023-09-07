package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.Employee;
import com.nctech.shopCart.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServices employeeServices;
    @PostMapping("/")
    public void save(@RequestBody Employee employee){
        employeeServices.save(employee);
    }
    @PutMapping("/")
    public void update(@RequestBody Employee employee){
        employeeServices.update(employee);
    }
    @GetMapping("/{id}")
    public Employee findById(@PathVariable Integer id){
        return employeeServices.findById(id);
    }
    @GetMapping("/")
    public List<Employee> findAll(){
        return employeeServices.findAll();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        employeeServices.delete(id);
    }

}
