package com.example.practice.DesignPatterns.StrategyDesignPrinciple.DriveStrategy;

public class NormalDriveStrategy implements DriveStartegy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Startegy");
    }
}
