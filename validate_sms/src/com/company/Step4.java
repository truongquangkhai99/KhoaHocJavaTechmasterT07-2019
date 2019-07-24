package com.company;

public class Step4 extends Step1{
    @Override
    public int getNext(Character c) {
        return c.equals(" ") ? 5 : 2;
    }
}
