package com.example.practice.DesignPatterns.StrategyDesignPrinciple;

import com.example.practice.DesignPatterns.StrategyDesignPrinciple.DriveStrategy.SportsDriveStrategy;

public class offRoadVehicle extends Vehicle{

    offRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
