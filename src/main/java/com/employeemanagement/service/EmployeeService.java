package com.employeemanagement.service;

import com.employeemanagement.entity.Employee;

import java.util.List;

// Define Service layer

public interface EmployeeService {

    // Intermediate layer for custom business logic and integrating data from multiple sources(DAO / repositories)
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
