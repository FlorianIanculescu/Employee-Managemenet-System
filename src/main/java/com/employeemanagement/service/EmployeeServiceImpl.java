package com.employeemanagement.service;

import com.employeemanagement.entity.Employee;
import com.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // Constructor injection for employeeRepository
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    // Retrieve all employees from database
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    // Retrieve an employee by id
    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;

        // Check if the actual employee "is present" to retrieve it
        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            // Didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        // Return the employee
        return theEmployee;
    }

    // Save or update the employee
    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    // Delete or update the employee
    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}