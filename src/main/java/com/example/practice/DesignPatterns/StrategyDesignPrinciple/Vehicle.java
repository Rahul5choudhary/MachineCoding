package com.example.practice.DesignPatterns.StrategyDesignPrinciple;

import com.example.practice.DesignPatterns.StrategyDesignPrinciple.DriveStrategy.DriveStartegy;

public class Vehicle {
    DriveStartegy driveObj;

    Vehicle (DriveStartegy driveStartegy){
        this.driveObj = driveStartegy;
    }

    public void drive(){
        driveObj.drive(); // idhar jo bhi startegy assign hoga wo us sportsStrategy ka drive class assign krega
    }
}
