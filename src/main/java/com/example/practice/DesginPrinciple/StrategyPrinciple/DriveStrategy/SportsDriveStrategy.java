package com.example.practice.DesginPrinciple.StrategyPrinciple.DriveStrategy;

public class SportsDriveStrategy implements DriveStartegy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Startegy");
    }
}
