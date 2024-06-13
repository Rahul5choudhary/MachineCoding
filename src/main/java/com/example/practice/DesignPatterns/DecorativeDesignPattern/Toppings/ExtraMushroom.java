package com.example.practice.DesignPatterns.DecorativeDesignPattern.Toppings;

import com.example.practice.DesignPatterns.DecorativeDesignPattern.BasePizza.BasePizza;

public class ExtraMushroom extends BasePizza {
    BasePizza pizza;
   public ExtraMushroom(BasePizza pizza){
       this.pizza = pizza;
   }

    @Override
    public int cost() {
       return  this.pizza.cost() + 20;
    }
}
