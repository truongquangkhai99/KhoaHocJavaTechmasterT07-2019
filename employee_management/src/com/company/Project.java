package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Project {
    private String name;
    private Double budget;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Project(String name, Double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Boolean addEmployee(Employee newEmployee) {
        if(newEmployee.getYearsOfService()<= 3 || this.budget <= 10000000) {
            System.out.println("Year of sv <= 3 or budget < 10000000");
            return  false;
        }
        if(this.budget < 4000000) {
            if(newEmployee.getYearsOfService() <= 5) {
                System.out.println("Year of sv <= 5 and budget < 4000000");
                return false;
            }
        }
        employees.add(newEmployee);
        return true;
    }
    public static Project input() {
        //Factory method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter project's name:");
        String projectName = scanner.nextLine();
        Double bugget = scanner.nextDouble();
        return new Project(projectName, bugget);
    }
}
