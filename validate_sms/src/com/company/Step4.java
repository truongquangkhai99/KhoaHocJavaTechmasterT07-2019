package com.company;

public class Step4 extends Step1{
    @Override
    public int getNext(char c) {
        return c == ' ' ? 5 : 2;
    }
}
