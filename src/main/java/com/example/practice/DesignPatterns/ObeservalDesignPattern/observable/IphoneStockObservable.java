package com.example.practice.DesignPatterns.ObeservalDesignPattern.observable;

import com.example.practice.DesignPatterns.ObeservalDesignPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements com.example.practice.DesignPatterns.ObeservalDesignPattern.observable.StockObservable {

    public int stockcount =0;
    public List<NotificationAlertObserver> observerList  = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
//        NotifySubscribers();
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
        NotifySubscribers();
    }

    @Override
    public void NotifySubscribers() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public int getstockCount(){
        return stockcount;
    }

    @Override
    public void setCount(int toAddstockcount){
        if(stockcount==0){
            NotifySubscribers();
        }
        stockcount +=toAddstockcount;

    }
}
