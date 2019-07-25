package com.company;

public class Factory {
    public static Step1 getStep(Integer i) {
        if(i == 1) return new Step1();
        if(i == 2) return new Step2();
        if(i == 3) return new Step3();
        if(i == 4) return new Step4();
        if(i == 5) return new Step5();
        if(i == 6) return new Step6();
        if(i == 7) return new Step7();
        return null;
    }
}
