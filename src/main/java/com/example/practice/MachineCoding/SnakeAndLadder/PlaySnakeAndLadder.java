package com.example.practice.MachineCoding.SnakeAndLadder;

import java.util.*;

public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        Dice dice = new Dice(1);
        Player player1 = new Player("Sagar",1);
        Player player2 = new Player("Rahul",2);
        Queue<Player> allplayers = new LinkedList<>();
        allplayers.offer(player1);
        allplayers.offer(player2);
        Jumper snake1 = new Jumper(10,2);
        Jumper snake2 = new Jumper(99,12);
        List<Jumper> snakes = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);

        Jumper ladder1 = new Jumper(5,21);
        Jumper ladder2 = new Jumper(81,99);
        List<Jumper> ladders = new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);
        Map<String , Integer> playerCurrentPositon = new HashMap<>();
        playerCurrentPositon.put(player1.getName(),0);
        playerCurrentPositon.put(player2.getName(),0);

        GameBoard gb = new GameBoard(dice,allplayers,snakes,ladders,playerCurrentPositon,100);
        gb.StartGame();;

//        Jumper ladder new Jumper()
    }
}
