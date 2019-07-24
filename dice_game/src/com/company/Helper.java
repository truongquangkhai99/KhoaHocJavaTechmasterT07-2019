package com.company;

import java.util.Random;

public class Helper {
    public static Integer getRandomNumber(Integer max) {
        //get random number from 0 to max - 1
        Random rand = new Random();
        Integer randomIndex = rand.nextInt(max);
        return randomIndex;
    }
}
