package com.example.practice.DesignPatterns.ObeservalDesignPattern.observable;

import com.example.practice.DesignPatterns.ObeservalDesignPattern.observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void NotifySubscribers();

    public int getstockCount();

    public void setCount(int count);

}
