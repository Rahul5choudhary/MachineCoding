package com.example.practice.DesignPatterns.ChainofResponsibiltiy.AtmMachine;

public class AtmManager {
    public static int TWOTHOUSAND = 2000;
    public static int FIVEHUNDRED = 500;
    public static int ONEHUNDRED = 100;

    protected AtmManager nextAtmManager;

    public AtmManager(AtmManager nextAtmManager) {
        this.nextAtmManager = nextAtmManager;
    }

    public void debit(int amount) {
        if (nextAtmManager != null) {
            nextAtmManager.debit(amount);
        }
        else {
            System.out.println("Cannot process this amount. No suitable currency available.");
        }
    }
}
