package com.company;

public class Step1 {
    public int getNext(char c) {
        if(c == 'L') {
            return 3;
        }else if(c == ' ') {
            return 2;
        } else {
            return 1;
        }
    }
}
