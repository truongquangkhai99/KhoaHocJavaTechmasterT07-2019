package com.company;

public class Employee {
    private String name = "";
    private Integer age = 18;
    private String email = "";
    private String phoneNumber;
    private Department department;

    //constructor = ham khoi tao = ham tao
    Employee(String name, Integer age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
