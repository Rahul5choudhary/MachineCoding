package com.example.practice.DesignPatterns.StrategyDesignPrinciple.DriveStrategy;

public class SportsDriveStrategy implements DriveStartegy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Startegy");
    }
}
