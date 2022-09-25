package com.bytebrains.employee.controller;

import com.bytebrains.employee.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/employees")
public class EmployeeV2Controller {

    @GetMapping
    public Employee getEmployee(@RequestBody Employee employee){
        return employee;
    }
}
