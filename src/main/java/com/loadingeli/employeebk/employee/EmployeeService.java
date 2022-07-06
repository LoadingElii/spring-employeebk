package com.loadingeli.employeebk.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> findAllEmployees() {
        return repository.findAll();
    }

    public Employee findEmployeeById(Integer id) {
        return repository.findEmployeeById(id);
    }

    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    public void deleteEmployeeById(Integer id) {
        repository.deleteEmployeeById(id);
    }
}
