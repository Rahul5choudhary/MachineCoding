package com.example.practice.DesignPatterns.DecorativeDesignPattern.Toppings;

import com.example.practice.DesignPatterns.DecorativeDesignPattern.BasePizza.BasePizza;

public class ExtraCheese extends Toppings{

    BasePizza basePizza ;

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
