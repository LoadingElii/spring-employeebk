package com.loadingeli.employeebk.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        List<Employee> employees = service.findAllEmployees();
        return employees;
    }

    @GetMapping("/search/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        Employee employee = service.findEmployeeById(id);
        return employee;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = service.addEmployee(employee);
        return newEmployee;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable("id")Integer id) {
        service.deleteEmployeeById(id);
    }

}
