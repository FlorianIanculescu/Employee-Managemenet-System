package com.employeemanagement.repository;

import com.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // No need to write other code
    // JpaRepository provides CRUD methods without having an interface and an implementation class
    // Can be extended with custom queries using JPQL
}
