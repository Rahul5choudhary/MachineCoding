package com.example.practice.DesignPatterns.ObeservalDesignPattern.observer;

import com.example.practice.DesignPatterns.ObeservalDesignPattern.observable.StockObservable;

public class MobileNotificationObserver implements NotificationAlertObserver {

    private StockObservable observer;
    private String mobile;

   public MobileNotificationObserver(String mobile, StockObservable observer){
        this.observer = observer;
        this.mobile = mobile;
    }

    @Override
    public void update(){
        System.out.println(mobile + " Hurry Up your Item is in Stock!!!");
        SendMail();
    }

    private void SendMail(){
        System.out.println(mobile + " Message on Mobile sent successfully");
    }
}
