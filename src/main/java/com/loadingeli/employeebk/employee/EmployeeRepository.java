package com.loadingeli.employeebk.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    void deleteEmployeeById(Integer id);

    Employee findEmployeeById(Integer id);
}

