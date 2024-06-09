package com.example.practice.DesignPatterns.SolidPrinciple.singleResponsibiltyPrinciple;

public class Invoice {

    private Marker marker ;
    private int quantity;

    Invoice(Marker marker,int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }


    public int calculatePrice(){
        int price = ((marker.price)*(this.quantity));
        return price;
    }



}
