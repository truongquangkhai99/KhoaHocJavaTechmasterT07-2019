package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*
        Employee mrHoang = new Employee();
        Employee employee2 = mrHoang;
        Employee employee3 = mrHoang;
        employee2.name = "AAA";
        employee3 = null;
        employee2 = null;
        mrHoang = null;
        int x = 10;
        int y = x;
        y = 5;

         */
        Employee mrJohn = new Employee("John", 20,
                "john@gmail.com", Gender.MALE, "09125545444");
        Employee msAnna = new Employee("Anna",
                18, "anna@gmail.com",Gender.FEMALE,"0111111");
        Employee mrHoang = new Employee("Hoang", 30,
                "hoang", Gender.MALE, "5555555");

        Department itDepartment = new Department("1",
                "phong IT", "chuyen cai dat may");
        Department salesDepartment = new Department("2",
                "phong SAles", "chuyen di ban hang");

        mrJohn.setDepartment(itDepartment);
        itDepartment.addEmployee(mrJohn);

        mrHoang.setDepartment(itDepartment);
        itDepartment.addEmployee(mrHoang);

        msAnna.setDepartment(salesDepartment);
        salesDepartment.addEmployee(msAnna);

        mrHoang.setDepartment(salesDepartment);
        itDepartment.removeEmployee(mrHoang);
        salesDepartment.addEmployee(mrHoang);

        System.out.println(mrHoang.MAX_SALARY);
        System.out.println(mrJohn.MAX_SALARY);
        System.out.println(msAnna.MAX_SALARY);

        //Sau mot thoi gian lam viec
        mrHoang.setYearsOfService(6);
        mrJohn.setYearsOfService(5);
        msAnna.setYearsOfService(6);
        //Project projectA = new Project("Project A", 11000000.0);
        Project projectA = Project.input();
        if(projectA.addEmployee(mrHoang)) {
           mrHoang.setProject(projectA);
            System.out.println("Add successfully");
        } else {
            System.out.println("CAnnnot add mr Hoang");
        }
        System.out.println("Number of employees = "+Employee.numberOfEmployees);

    }
}
