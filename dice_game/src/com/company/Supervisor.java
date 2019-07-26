package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Supervisor {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();
    public double playGame() {
        Boolean isFinished = false;
        Integer step = 0;
        while (!isFinished){
            step++;
            System.out.println("Step: "+ step);
            //Chỉ dịnh ai chơi bước này: lấy ngẫu nhiên player1 -> player4
            Integer randomIndex = Helper.getRandomNumber(players.size());
            Player player = players.get(randomIndex);
            System.out.println(String.format("%s is playing", player.getName()));
            isFinished = player.playDice();
        }
        return 1.00/(double)step;//possibility / properbility
    }
    public void playMatches(Integer matches) {
        double sum = 0.00;
        for(int i = 0; i< matches; i++) {
            System.out.println("Match Number: "+(i+1));
            sum = sum + playGame();
        }
        System.out.println("P = "+sum/((double)matches));
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
        return String.format("Name = %s", name);
    }
}
