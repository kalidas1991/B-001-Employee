package com.bytebrains.employee.service;

import com.bytebrains.employee.error.EmployeeNotFoundException;
import com.bytebrains.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee saveEmployee(Employee employee) {
        if (employee.getId() == null || employee.getEmail().isEmpty()) {
            employee.setId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employees;
    }

    @Override
    public Employee getEmployee(String id) {
        return employees.stream().filter(emp -> emp.getId().equalsIgnoreCase(id))
                .findFirst().orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found with Id : " + id));
    }

    @Override
    public String deleteEmployee(String id) {
        Employee deleteEmployee = employees.stream().filter(emp -> emp.getId().equalsIgnoreCase(id))
                .findFirst().orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found with Id : " + id));
        employees.remove(deleteEmployee);
        return "Employee Deleted Successfully with the id : " + id;
    }
}
