package com.company;

public class Step2 extends Step1 {
    @Override
    public void show() {
        System.out.println("Step 2 - Check space");
    }

    @Override
    public int getNext(char c) {
        if (c == 'L') {
            return 3;
        }
        return c == ' ' ? 1 : 2;
    }
}
