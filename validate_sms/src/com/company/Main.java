package com.company;

public class Main {

    public static void main(String[] args) {
        String inputString = "Toi xin gui LQ    G toi ten la abc";
        //String inputString = "LA G";
        //String inputString = "LW G";
        //String inputString = "LQ NN";
        Step1 step = new Step1();
        for(int i = 0; i < inputString.length(); i++) {
            if (i == 11) {
                System.out.println("dd");
            }
            Integer j = step.getNext(inputString.charAt(i));
            step = Factory.getStep(j);
        }
        step.show();
    }
}
