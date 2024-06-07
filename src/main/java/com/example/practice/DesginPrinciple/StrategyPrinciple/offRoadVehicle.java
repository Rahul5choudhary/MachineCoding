package com.example.practice.DesginPrinciple.StrategyPrinciple;

import com.example.practice.DesginPrinciple.StrategyPrinciple.DriveStrategy.SportsDriveStrategy;

public class offRoadVehicle extends Vehicle{

    offRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
