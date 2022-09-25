package com.bytebrains.employee.error;

/**
 * User : Kalidas Daundkar
 * Description : This class is used to create a custom exception If Employee is not found (EmployeeNotFoundException)
 */
public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String message){
        super(message);
    }
}
