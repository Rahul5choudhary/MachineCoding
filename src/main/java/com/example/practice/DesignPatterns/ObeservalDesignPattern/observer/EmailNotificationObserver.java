package com.example.practice.DesignPatterns.ObeservalDesignPattern.observer;

import com.example.practice.DesignPatterns.ObeservalDesignPattern.observable.StockObservable;

public class EmailNotificationObserver implements NotificationAlertObserver {

    private StockObservable stockObservable;
    private String email;

    public EmailNotificationObserver(String email, StockObservable stockObservable){
        this.stockObservable = stockObservable;
        this.email = email;
    }
//    EmailNotificationObserver

    @Override
    public void update(){
        System.out.println(email + " Hurry Up your Item is in Stock!!!");
        SendMail();
    }

    private void SendMail(){
        System.out.println(email + " Email send successfully");
    }
}
