package com.company;

public class Dice {

    private Integer diceId;
    public Integer getMarks() {
        //Quan xuc sac 6 mat 1 -> 6
        return Helper.getRandomNumber(5) + 1;
    }

    public Dice(Integer diceId) {
        this.diceId = diceId;
    }

    @Override
    public String toString() {
        return "diceId: "+diceId;
    }
}
