package com.myapp;

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
                    String strTemp = inputStrings[i];
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
        for(int i = 0; i < names.length; i++) {
            String firstCharacter = String.valueOf(names[i].charAt(0));
            //System.out.println("names[i] = "+names[i]);
            outputNames[currentPosition] = firstCharacter;
            outputNames[++currentPosition] = names[i];
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
}
