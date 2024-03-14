package com.employeemanagement.exception;

public class EmployeeNotFoundException extends RuntimeException {

    // Custom exception class used by REST service if it can't find the student
    // Will throw an exception calling super class (RuntimeException) constructor using Inheritance
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
