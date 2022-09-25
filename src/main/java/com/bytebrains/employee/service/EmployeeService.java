package com.bytebrains.employee.service;

import com.bytebrains.employee.model.Employee;

import java.util.List;


public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployee(String id);
}
