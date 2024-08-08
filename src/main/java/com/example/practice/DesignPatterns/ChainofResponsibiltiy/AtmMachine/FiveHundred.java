package com.example.practice.DesignPatterns.ChainofResponsibiltiy.AtmMachine;

public class FiveHundred extends AtmManager {
    public FiveHundred(AtmManager atmManager) {
        super(atmManager);
    }

    public void debit(int amount) {
        if (amount >= AtmManager.FIVEHUNDRED) {
            int count = amount / (AtmManager.FIVEHUNDRED);
            System.out.println(count + " 500 Notes Withdrawn");
            amount = amount - count * AtmManager.FIVEHUNDRED;
            super.debit(amount);
        } else {
            super.debit(amount);
        }
    }
}
