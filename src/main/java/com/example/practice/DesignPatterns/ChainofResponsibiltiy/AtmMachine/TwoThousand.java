package com.example.practice.DesignPatterns.ChainofResponsibiltiy.AtmMachine;

public class TwoThousand extends AtmManager {

    public TwoThousand(AtmManager atmManager){
        super(atmManager);
    }

    public void debit(int amount){
        if(amount>=AtmManager.TWOTHOUSAND){
            int countoftwoThousandNote = amount / (AtmManager.TWOTHOUSAND);
            System.out.println(countoftwoThousandNote + " 2000 Notes Withdrawn");
            amount = amount - (countoftwoThousandNote * AtmManager.TWOTHOUSAND);
//            System.out.println(amount);
            super.debit(amount);
        }else{
            super.debit(amount);
        }
    }
}
