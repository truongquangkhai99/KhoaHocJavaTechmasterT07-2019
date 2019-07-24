package com.company;


import java.util.ArrayList;

public class Player {
    public static Integer numberOfPlayers = 0;
    public static final Integer MAX_PLAYERS = 4;

    private Integer playerId;
    private PlayerType playerType;
    private String name;
    private Integer marks;
    //relation
    private Supervisor supervisor;
    private ArrayList<Dice> dices = new ArrayList<>();


    //default constructor
    Player() {
        playerId = 0;
        playerType = PlayerType.COMPUTER;
        name = "";
        marks = 0;
    }

    public ArrayList<Dice> getDices() {
        return dices;
    }

    public void setDices(ArrayList<Dice> dices) {
        this.dices = dices;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public Player(Integer playerId, PlayerType playerType, String name) {
        this.playerId = playerId;
        this.playerType = playerType;
        this.name = name;
        marks = 0;
        numberOfPlayers++;
    }

    public boolean playDice() {
        //1. chọn quân xúc sắc
        Integer randomIndex = Helper.getRandomNumber(dices.size());
        Dice dice = dices.get(randomIndex);
        //2. Giao quân xúc săc vừa chọn
        Integer marks = dice.getMarks();
        marks = marks + this.marks;
        if(marks == 21) {
            this.marks = marks;
            return true;
        } else if(marks > 21) {
            this.marks = 0;
            return false;
        } else if(marks < 21) {
            this.marks = marks;
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "playerId"+playerId+
                "\nplayerType: "+playerType+
                "\nname: "+name+
                "\nmarks: "+ marks;
    }
}
