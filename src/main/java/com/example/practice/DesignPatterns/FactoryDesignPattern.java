package com.example.practice.DesignPatterns;

//public class FactoryDesignPattern {
//}

import com.fasterxml.jackson.databind.ser.Serializers;

public class FactoryDesignPattern {

    public static void main(String[] args) {
        FarmHouse farmHouse = new FarmHouse();
        VegDelight vegDelight = new VegDelight();
        Margeritha margeritha = new Margeritha();

        System.out.println("Farm House Pizza " + farmHouse.cost());
        System.out.println("Veg Delight Pizza " + vegDelight.cost());
        System.out.println("Margeritha Pizza " + margeritha.cost());


        BasePizza farmHousewithextracheesse = new ExtraCheese(farmHouse);
        System.out.println("FarmHouse Pizza with Extra cheese " + farmHousewithextracheesse.cost());

        BasePizza farmhouswWithextraMushroom = new ExtraMushroom(farmHouse);
        System.out.println("FarmHouse Pizza with Extra Mushroom " + farmhouswWithextraMushroom.cost());



        BasePizza vegDelightwithextracheesse = new ExtraCheese(vegDelight);
        System.out.println("VegDelight Pizza with Extra cheese " + vegDelightwithextracheesse.cost());

        BasePizza vegDelightWithextraMushroom = new ExtraMushroom(vegDelight);
        System.out.println("VegDelight Pizza with Extra Mushroom " + vegDelightWithextraMushroom.cost());



        BasePizza margerithawithextracheesse = new ExtraCheese(margeritha);
        System.out.println("Margeritha Pizza with Extra Cheese " + margerithawithextracheesse.cost());

        BasePizza margerithawithextrmushrrom = new ExtraMushroom(margeritha);
        System.out.println("Margeritha Pizza with Extra Mushroom " + margerithawithextrmushrrom.cost());




    }
}

abstract class BasePizza {
    public abstract int cost();
}

class Margeritha extends BasePizza {

    @Override
    public int cost() {
        return 120;
    }

}


class FarmHouse extends BasePizza {

    @Override
    public int cost() {
        return 130;
    }

}


class VegDelight extends BasePizza {

    @Override
    public int cost() {
        return 140;
    }

}

class Toppings extends BasePizza {

    @Override
    public int cost() {
        return 0;
    }
}


class ExtraCheese extends Toppings {

    BasePizza basepizza;

    public ExtraCheese(BasePizza pizza) { // constructor
        this.basepizza = pizza;
    }

    @Override
    public int cost() {
        return this.basepizza.cost() + 10;
    }

}


class ExtraMushroom extends Toppings {

    private BasePizza basepizza;

    ExtraMushroom(BasePizza pizza) { // constructor
        this.basepizza = pizza;
    }

    @Override
    public int cost() {
        return this.basepizza.cost() + 20;
    }

}


