package com.loadingeli.employeebk.employee;


import javax.persistence.*;

@Entity
@Table (name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column (name = "name")
    private String name;
    @Column (name = "role")
    private String role;

    public Employee(){};

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
