package com.example.practice.DesginPrinciple.StrategyPrinciple;


import com.example.practice.DesginPrinciple.StrategyPrinciple.DriveStrategy.SportsDriveStrategy;

public class SportsCars extends Vehicle {

    SportsCars(){
        super(new SportsDriveStrategy());
    }


}
