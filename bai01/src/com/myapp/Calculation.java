package com.myapp;

public class Calculation {
    //function = method
    public static Integer sum2Numbers(Integer x, Integer y) {
        //x, y = input parameters
        return  x + y;
    }
    public static Double minus2Numbers(Double x, Double y) {
        return x - y;
    }
    public static void sayHello(String message) {
        System.out.println("I say: "+message);
    }
    public static void doSomething() {
        Integer[] integers = {1, 5, 4, 6, 6, 7, 8, 9};//this is an array
        //iterate an array
        Integer numberOfEven = 0;
        for(int i = 0; i < integers.length; i++) {
            //System.out.println("number ="+integers[i]);
            if(integers[i] % 2 == 0) {
                System.out.println("number ="+integers[i]);
                numberOfEven++;
            }
        }
        System.out.println("Number of evens = "+numberOfEven);
    }
    public static void convertCurrency() {

        String input = "12345678";
        String x = String.format("%,d", Integer.valueOf(input));
        String y = x.replace(',','.');
        String output = y+" VND";
        System.out.println("Result is: ");
        System.out.println(output);

    }
}
