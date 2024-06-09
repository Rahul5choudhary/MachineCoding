package com.example.practice.DesignPatterns.StrategyDesignPrinciple;


import com.example.practice.DesignPatterns.StrategyDesignPrinciple.DriveStrategy.SportsDriveStrategy;

public class SportsCars extends Vehicle {

    SportsCars(){
        super(new SportsDriveStrategy());
    }


}
