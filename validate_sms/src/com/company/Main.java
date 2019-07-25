package com.company;

public class Main {

    public static void main(String[] args) {
        String inputString = "Chao ban    LQ    G toi ten la abc";
        Step1 step1 = new Step1();
        for(int i = 0; i < inputString.length(); i++) {
            Integer j = step1.getNext(inputString.charAt(i));
            step1 = Factory.getStep(j);
        }
        if(step1 instanceof Step6 || step1 instanceof Step7) {
            System.out.println("input string is ok!");
        }
    }
}
