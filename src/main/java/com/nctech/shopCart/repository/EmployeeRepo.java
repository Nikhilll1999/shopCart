package com.nctech.shopCart.repository;

import com.nctech.shopCart.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
