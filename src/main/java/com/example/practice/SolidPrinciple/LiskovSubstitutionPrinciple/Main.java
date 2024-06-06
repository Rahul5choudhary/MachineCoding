package com.example.practice.SolidPrinciple.LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

//Liskove substituation Principle Defination : A object of superClass should be accessible with object of its subclass without breaking the appication
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Bicycle());
        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getNumberofWheels().toString());
        }

        List<EngineVehicle> engineVehicles = new ArrayList<>();
        engineVehicles.add(new Car());
        engineVehicles.add(new MotorCycle());

        for(EngineVehicle engineVehicle : engineVehicles){
            System.out.println(engineVehicle.getClass() +" : "+engineVehicle.hasEngine());
        }
    }
}
