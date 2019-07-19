package com.company;
enum Gender {
    MALE,
    FEMALE
}
public class Employee {
    public static final Double MAX_SALARY = 40.0;
    public static Integer numberOfEmployees = 0;
    private String name = "";
    private Integer age = 18;
    private String email = "";
    private String phoneNumber;
    private Department department;
    private Gender gender;
    private Integer yearsOfService = 0;
    private Project project;

    //constructor = ham khoi tao = ham tao
    Employee(String name, Integer age, String email, Gender gender, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        numberOfEmployees++;
    }

    public Integer getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(Integer yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public Gender getGender() {
        return gender;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
