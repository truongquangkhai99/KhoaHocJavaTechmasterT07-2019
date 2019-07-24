package com.company;

public class Step2 extends Step1 {
    @Override
    public int getNext(Character c) {
        return c.equals(" ") ? 1 : 2;
    }
}
