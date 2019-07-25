package com.company;

public class Step4 extends Step1{
    @Override
    public void show() {
        System.out.println("Step 4 - Check LG-space");
    }

    @Override
    public int getNext(char c) {
        return c == ' ' ? 5 : 2;
    }
}
