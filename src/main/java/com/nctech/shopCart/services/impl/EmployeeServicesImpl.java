package com.nctech.shopCart.services.impl;

import com.nctech.shopCart.dto.Employee;
import com.nctech.shopCart.repository.EmployeeRepo;
import com.nctech.shopCart.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServicesImpl implements EmployeeServices {
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public void save(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void update(Employee employee) {
      employeeRepo.save(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepo.findById(id).orElse(new Employee());
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
       employeeRepo.deleteById(id);
    }
}
