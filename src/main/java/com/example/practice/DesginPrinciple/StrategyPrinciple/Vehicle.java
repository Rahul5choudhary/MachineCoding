package com.example.practice.DesginPrinciple.StrategyPrinciple;

import com.example.practice.DesginPrinciple.StrategyPrinciple.DriveStrategy.DriveStartegy;

public class Vehicle {
    DriveStartegy driveObj;

    Vehicle (DriveStartegy driveStartegy){
        this.driveObj = driveStartegy;
    }

    public void drive(){
        driveObj.drive(); // idhar jo bhi startegy assign hoga wo us sportsStrategy ka drive class assign krega
    }
}
