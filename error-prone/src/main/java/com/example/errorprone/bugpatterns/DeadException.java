package com.example.errorprone.bugpatterns;

import com.example.errorprone.utils.Employee;

public class DeadException {

    /**
     * The exception is created with new, but is not thrown, and the reference is lost.
     * <p>
     * Creating an exception without using it is unlikely to be correct, so Error Prone assumes that you wanted to throw the exception.
     */
    public void validateEmployee(Employee employee) {
        if (employee.getAge() < 18) {
            new RuntimeException("Employee with id {} is a minor and not allowed to access the flow");
        } else {
            // continue with the flow
        }
    }
}
