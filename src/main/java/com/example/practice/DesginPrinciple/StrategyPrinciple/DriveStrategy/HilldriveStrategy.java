package com.example.practice.DesginPrinciple.StrategyPrinciple.DriveStrategy;


public class HilldriveStrategy implements DriveStartegy {

    @Override
    public void drive() {
        System.out.println("Hill Drive Strategy");
    }
}
