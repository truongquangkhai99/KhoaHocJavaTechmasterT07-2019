package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Supervisor supervisor = new Supervisor("trong tai A");
	    Player player1 = new Player(1,
                            PlayerType.HUMAN,
                        "player A");
	    player1.setSupervisor(supervisor);

	    Player player2 = new Player(2,
                PlayerType.HUMAN,
                "player B");
        player2.setSupervisor(supervisor);

        Player player3 = new Player(3,
                PlayerType.COMPUTER,
                "player C");
        player3.setSupervisor(supervisor);

        Player player4 = new Player(4,
                PlayerType.COMPUTER,
                "player D");
        player4.setSupervisor(supervisor);
        //relations
        supervisor.getPlayers().add(player1);
        supervisor.getPlayers().add(player2);
        supervisor.getPlayers().add(player3);
        supervisor.getPlayers().add(player4);

        Dice dice1 = new Dice(1);
        Dice dice2 = new Dice(2);
        Dice dice3 = new Dice(3);
        Dice dice4 = new Dice(4);
        Dice dice5 = new Dice(5);

        ArrayList<Dice> dices = new ArrayList<>();
        dices.add(dice1);dices.add(dice2);dices.add(dice3);
        dices.add(dice4);dices.add(dice5);

        player1.setDices(dices);
        player2.setDices(dices);
        player3.setDices(dices);
        player4.setDices(dices);

        supervisor.playGame();

    }
}
