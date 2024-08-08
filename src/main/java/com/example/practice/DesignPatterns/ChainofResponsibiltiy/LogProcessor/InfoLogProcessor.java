package com.example.practice.DesignPatterns.ChainofResponsibiltiy.LogProcessor;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int loglevel , String message){
        if(loglevel == LogProcessor.INFO){
            System.out.println("INFO : " + message);
        }else{
            super.log(loglevel,message);
        }
    }

}
