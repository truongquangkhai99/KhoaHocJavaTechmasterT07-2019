package com.myapp;

import static java.lang.Float.NaN;

public class Main {
    public static  void main(String [] args) {
        //args = arguments
        Calculation.sayHello("Chao cac ban");
        Integer sum = Calculation.sum2Numbers(3, 2);
        System.out.println("Tong = "+sum);
        System.out.println(" 10 -5 ="+Calculation.minus2Numbers(10.0, 5.0));
        Calculation.doSomething();
        float f = NaN;
        System.out.println(f!=f);
        Calculation.convertCurrency();
        

    }

}
