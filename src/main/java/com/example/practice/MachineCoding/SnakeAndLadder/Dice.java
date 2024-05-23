package com.example.practice.MachineCoding.SnakeAndLadder;
import java.util.Random;

public class Dice {
    private int numberofDice;

    public Dice(int numberofDice){
        this.numberofDice = numberofDice;
    }

    public  int rollDice(){
        Random rand = new Random();
        int diceRoll = rand.nextInt(6) + 1;
//        System.out.println("Dice rolled :" + diceRoll);
        return diceRoll;
    }

    public int getNumberofDice() {
        return numberofDice;
    }

    public void setNumberofDice(int numberofDice) {
        this.numberofDice = numberofDice;
    }

//    public static void main(String[] args) {
//        Dice d = new Dice(1);
//        System.out.println("Dice roll :"+ d.rollDice());
//    }
}
