package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.Employee;

import java.util.List;

public interface EmployeeServices {
    void save(Employee employee);
    void update(Employee employee);
    Employee findById(Integer id);
    List<Employee>findAll();
    void delete(Integer id);
}
