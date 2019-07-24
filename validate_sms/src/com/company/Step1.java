package com.company;

public class Step1 {
    public int getNext(Character c) {
        if(c.equals("L")) {
            return 3;
        }else if(c.equals(" ")) {
            return 1;
        } else {
            return 2;
        }
    }
}
