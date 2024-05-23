package com.example.practice.MachineCoding.SnakeAndLadder;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameBoard {
    private Dice dice;
    private Queue<Player> nextTurn;
    private List<Jumper> snakes;
    private List<Jumper> ladders;
    private Map<String, Integer> playerCurrentPostion;
    private int boradsize;

    public GameBoard(Dice dice, Queue<Player> nextTurn, List<Jumper> snakes, List<Jumper> ladders, Map<String, Integer> playerCurrentPostion, int boradsize) {
        this.dice = dice;
        this.nextTurn = nextTurn;
        this.snakes = snakes;
        this.ladders = ladders;
        this.playerCurrentPostion = playerCurrentPostion;
        this.boradsize = boradsize;
    }

    public void StartGame() {

        while (nextTurn.size() > 1) {
            Player player = nextTurn.poll(); //Queue ka front element nikal ke usse delete kr diya front element ko
            int currenPosition = playerCurrentPostion.get(player.getName()); // basically ek map me store krenge and fir wha se we can get the playerslast postion abhi aage update bhi krna pdega
            int diceValue = dice.rollDice();
            System.out.println(player.getName() + " rolled get dice " + diceValue);
            int nextCell = currenPosition + diceValue;
            if (nextCell > boradsize) {
                int needtowin = 100 - currenPosition;
                System.out.println("Oops Mr." + player.getName() + " needs " + needtowin + " to win the game");
                nextTurn.offer(player);
            } // inserts the specified element into this queue
            else if (nextCell == boradsize) {
                System.out.println(player.getName() + " Won the game");
            } else {
                int[] nextpositon = new int[1];
                nextpositon[0] = nextCell;

                int[] b = new int[1];
                b[0] = 0;

                snakes.forEach(v -> {
                    if (v.startPoint == nextCell) {
                        nextpositon[0] = v.endPoint;
                    }
                });

                if (nextpositon[0] != nextCell) {
                    System.out.println(player.getName() + " is Bitten by snake at " + nextCell + " and reached to " + nextpositon[0]);
                }

                ladders.forEach(v -> {
                    if (v.startPoint == nextCell) {
                        nextpositon[0] = v.endPoint;
                        b[0] = 1;
                    }
                });
                if (nextpositon[0] != nextCell && b[0] == 1) {
                    System.out.println(player.getName() + "is got Ladder at " + nextCell + " to " + nextpositon[0]);
                }

                if (nextpositon[0] == boradsize) {
                    System.out.println(player.getName() + "Won the game");
                } else {
                    playerCurrentPostion.put(player.getName(), nextpositon[0]);
                    System.out.println(player.getName() + " is Moved from  " + currenPosition + " to the this position " + nextpositon[0]);
                    nextTurn.offer(player); // putted back player in the queue so that player can come back and finish the game
                }


            }

        }

    }
}
