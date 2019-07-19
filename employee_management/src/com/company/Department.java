package com.company;

import java.util.ArrayList;

public class Department {
    private String departmentId, name, description;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    Department(String departmentId, String name, String description) {
        this.departmentId = departmentId;
        this.name = name;
        this.description = description;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
