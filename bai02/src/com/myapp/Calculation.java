package com.myapp;

import java.util.Scanner;
import java.util.function.Function;

public class Calculation {
    public static Double getY(Double x) {
        Double y = (Math.pow(x, 3) + 1) / (Math.pow(x, 2) + 2);
        //Double y = Math.abs(x - 1);
        System.out.println("y = "+String.format("%.2f", y));
        final Double PI = 3.1416;
        return y;
    }
    public static String[] sortStrings(String[] inputStrings) {
        //String[] result = new String[20];
        for(int i = 0; i < inputStrings.length - 1; i++) {
            for(int j = i + 1; j < inputStrings.length; j++) {
                if(inputStrings[i].compareTo(inputStrings[j]) > 0) {
                    //swap
                    String strTemp = inputStrings[i];//reference = pointer
                    inputStrings[i] = inputStrings[j];
                    inputStrings[j] = strTemp;
                }
            }
        }
        System.out.println("Sau khi sap xep: ");
        for(int i = 0; i < inputStrings.length; i++) {
            System.out.print(inputStrings[i]);
        }

        return inputStrings;
    }

    public static void doSomething() {
        String [] names = {"Hoang", "Vinh", "Hung", "An"}; //array != "collection, list"
        names = sortStrings(names);
        String [] outputNames = new String[8];
        Integer currentPosition = 0;
        //i = iterate
        String firstCharacter = "";
        for(int i = 0; i < names.length; i++) {
            if(!String.valueOf(names[i].charAt(0)).equals(firstCharacter)) {
                firstCharacter = String.valueOf(names[i].charAt(0));
                outputNames[currentPosition] = firstCharacter;
                outputNames[++currentPosition] = names[i];

            } else {
                outputNames[currentPosition] = names[i];
            }
            currentPosition++;

        }
        System.out.println("dddd");
        for(int i = 0; i < outputNames.length; i++) {
            if(i == outputNames.length-1) {
                System.out.print("names["+i+"] = "+outputNames[i]);
            } else {
                System.out.print("names["+i+"] = "+outputNames[i]+", ");
            }

        }
    }
    public static void doSomething2() {
        //Calculate time period
        Double x = 3.2;
        Double y = 0.0;
        //Get current Timestamp
        long t1 = System.nanoTime();
        int i = 0;
        while (i < 1000000) {
            y = Math.pow(x, 20) + x + 100;
            i++;
        }

        long t2 = System.nanoTime();
        System.out.println("time period = "+((double)(t2-t1))/Math.pow(10,9));
        float f = (float)System.nanoTime();


        System.out.println(f != f);
    }
}
