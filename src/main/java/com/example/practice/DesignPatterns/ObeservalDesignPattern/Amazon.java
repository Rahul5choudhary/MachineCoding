package com.example.practice.DesignPatterns.ObeservalDesignPattern;


import com.example.practice.DesignPatterns.ObeservalDesignPattern.observable.IphoneStockObservable;
import com.example.practice.DesignPatterns.ObeservalDesignPattern.observable.StockObservable;
import com.example.practice.DesignPatterns.ObeservalDesignPattern.observer.EmailNotificationObserver;
import com.example.practice.DesignPatterns.ObeservalDesignPattern.observer.MobileNotificationObserver;
import com.example.practice.DesignPatterns.ObeservalDesignPattern.observer.NotificationAlertObserver;

public class Amazon {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();
        NotificationAlertObserver observer1 = new EmailNotificationObserver("abc@email.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailNotificationObserver("xuz@email.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileNotificationObserver("999999999", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setCount(10);
        iphoneStockObservable.setCount(100);
    }

}

