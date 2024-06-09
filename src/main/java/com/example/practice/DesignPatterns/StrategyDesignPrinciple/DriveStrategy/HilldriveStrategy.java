package com.example.practice.DesignPatterns.StrategyDesignPrinciple.DriveStrategy;


public class HilldriveStrategy implements DriveStartegy {

    @Override
    public void drive() {
        System.out.println("Hill Drive Strategy");
    }
}
