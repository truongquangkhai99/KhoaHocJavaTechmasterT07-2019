package com.company;

public class Step5 extends Step1 {
    @Override
    public int getNext(Character c) {
        return c.equals("G") ? 6 : c.equals(" ") ? 5 : 2;
    }
}
