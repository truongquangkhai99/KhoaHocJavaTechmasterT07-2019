package com.company;

public class Step1 {
    public void show() {
        System.out.println("Step 1 - Check L");
    }
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
