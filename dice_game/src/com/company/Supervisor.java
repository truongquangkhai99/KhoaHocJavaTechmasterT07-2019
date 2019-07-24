package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Supervisor {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();
    public void playGame() {
        Boolean isFinished = false;
        while (!isFinished){
            //Chỉ dịnh ai chơi bước này: lấy ngẫu nhiên player1 -> player4
            Integer randomIndex = Helper.getRandomNumber(players.size());
            Player player = players.get(randomIndex);
            isFinished = player.playDice();
        }
    }

    public Supervisor(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "name:"+name;
    }
}
