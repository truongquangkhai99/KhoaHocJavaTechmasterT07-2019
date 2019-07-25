package com.company;

public class Step6 extends Step1 {
    @Override
    public int getNext(Character c) {
        Boolean isNormalCharacter = (c >= 'a' && c <= 'z') ||
                                    (c >= 'A' && c <= 'Z') ||
                                    (c >= '0' && c <= '9');
        if(c.equals(" ") || !isNormalCharacter) {
            return 7;
        }
        return 2;
    }
}
