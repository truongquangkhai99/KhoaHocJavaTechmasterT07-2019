package com.company;

public class Step2 extends Step1 {
    @Override
    public int getNext(char c) {
        return c == ' ' ? 1 : 2;
    }
}
