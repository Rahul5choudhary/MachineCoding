package com.example.practice.DesignPatterns.ChainofResponsibiltiy.AtmMachine;

public class MainClass {

    public static void main(String[] args) {
        AtmManager atmChain = new TwoThousand(new FiveHundred(new OneHundred(null)));

//        AtmManager atmChain = new OneHundred(
//                new FiveHundred(
//                        new TwoThousand(null)
//                )
//        );

        atmChain.debit(3700);  // Should withdraw 1 x 2000, 1 x 500, 2 x 100
        atmChain.debit(650);   // Should withdraw 1 x 500, 1 x 100, 1 x 50 (not available)
        atmChain.debit(1000);  // Should withdraw 1 x 500, 1 x 500
        atmChain.debit(90);    // Should withdraw 0 x 2000, 0 x 500, 0 x 100 (cannot process)
    }
}
