package com.example.practice.DesginPrinciple.StrategyPrinciple.DriveStrategy;

public class NormalDriveStrategy implements DriveStartegy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Startegy");
    }
}
