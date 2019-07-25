package com.company;

public class Step7 extends Step1 {
    @Override
    public void show() {
        System.out.println("Step 7 - ok");
    }

    @Override
    public int getNext(char c) {
        return 7;
    }
}
