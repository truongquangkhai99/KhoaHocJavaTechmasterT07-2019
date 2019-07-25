package com.company;

public class Step5 extends Step1 {
    @Override
    public int getNext(char c) {
        return c == 'G' ? 6 : c == ' ' ? 5 : 2;
    }
}
