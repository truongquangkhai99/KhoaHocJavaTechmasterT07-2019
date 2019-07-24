package com.company;

public class Step3 extends Step1{
    @Override
    public int getNext(Character c) {
        return c.equals("Q") ? 4 : 2;
    }
}
