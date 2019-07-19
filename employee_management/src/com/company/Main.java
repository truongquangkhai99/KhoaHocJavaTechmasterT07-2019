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
                "john@gmail.com", "09125545444");
        Employee msAnna = new Employee("Anna",
                18, "anna@gmail.com","0111111");
        Employee mrHoang = new Employee("Hoang", 30,
                "hoang", "5555555");
        Department itDepartment = new Department("1",
                "phong IT", "chuyen cai dat may");
        Department salesDepartment = new Department("2",
                "phong SAles", "chuyen di ban hang");

        System.out.println("hello");
    }
}
