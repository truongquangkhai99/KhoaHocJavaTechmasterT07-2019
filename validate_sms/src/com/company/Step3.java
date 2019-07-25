package com.company;

public class Step3 extends Step1{
    @Override
    public int getNext(char c) {
        return c == 'Q' ? 4 : 2;
    }
}
