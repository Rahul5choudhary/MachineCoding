package com.example.practice.DesignPatterns.DecorativeDesignPattern;

import com.example.practice.DesignPatterns.DecorativeDesignPattern.BasePizza.BasePizza;
import com.example.practice.DesignPatterns.DecorativeDesignPattern.BasePizza.FarmHouse;
import com.example.practice.DesignPatterns.DecorativeDesignPattern.BasePizza.Margeritha;
import com.example.practice.DesignPatterns.DecorativeDesignPattern.BasePizza.VegDelight;
import com.example.practice.DesignPatterns.DecorativeDesignPattern.Toppings.ExtraCheese;
import com.example.practice.DesignPatterns.DecorativeDesignPattern.Toppings.ExtraMushroom;
import com.fasterxml.jackson.databind.ser.Serializers;

public class Pizza {
    public static void main(String[] args) {
        FarmHouse farmHouse = new FarmHouse();
        Margeritha margeritha = new Margeritha();
        VegDelight vegDelight = new VegDelight();

        BasePizza farmhousewithExtracheese =  new ExtraCheese(farmHouse);
        System.out.println("Cost of FarmHouse pizza with Extra cheese "+ farmhousewithExtracheese.cost());

        BasePizza farmhousewithExtraMushroom = new ExtraMushroom(farmHouse);
        System.out.println("Cost of FarmHouse pizza with Extra Mushroom "+ farmhousewithExtraMushroom.cost());

        BasePizza margertihawithExtracheese =  new ExtraCheese(margeritha);
        System.out.println("Cost of Margeritha pizza with Extra cheese "+ margertihawithExtracheese.cost());

        BasePizza margerithawithExtraMushroom = new ExtraMushroom(margeritha);
        System.out.println("Cost of Margeritha pizza with Extra Mushroom "+ margerithawithExtraMushroom.cost());


        BasePizza vegDelightwithExtracheese =  new ExtraCheese(vegDelight);
        System.out.println("Cost of VegDelight pizza with Extra cheese "+ vegDelightwithExtracheese.cost());

        BasePizza vegDelightawithExtraMushroom = new ExtraMushroom(vegDelight);
        System.out.println("Cost of VegDelight pizza with Extra Mushroom "+ vegDelightawithExtraMushroom.cost());


    }



}
