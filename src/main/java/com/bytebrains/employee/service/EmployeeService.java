package com.bytebrains.employee.service;

import com.bytebrains.employee.model.Employee;

import java.util.List;

/**
 * User : Kalidas Daundkar
 * Description : This interface is used to declare all method (get,create,delete)
 */

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployee(String id);

    String deleteEmployee(String id);
}
