package com.example.practice.DesignPatterns.ChainofResponsibiltiy.AtmMachine;

public class OneHundred extends AtmManager {
    public OneHundred(AtmManager atmManager) {
        super(atmManager);
    }

    public void debit(int amount) {
        if (amount >= AtmManager.ONEHUNDRED) {
            int count = amount / (AtmManager.ONEHUNDRED);
            System.out.println(count + " 100 Notes Withdrawn");
            amount = amount - count * AtmManager.ONEHUNDRED;
            if(amount>0) {
                super.debit(amount);
            }
        } else {
            super.debit(amount);
        }
    }
}
