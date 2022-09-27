package com.bytebrains.employee.controller;

import com.bytebrains.employee.model.Employee;
import com.bytebrains.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return empService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return empService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return empService.getEmployee(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable String id) {
        return empService.deleteEmployee(id);

    }

}
