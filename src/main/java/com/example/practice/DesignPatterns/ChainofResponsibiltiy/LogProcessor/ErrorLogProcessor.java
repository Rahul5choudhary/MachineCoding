package com.example.practice.DesignPatterns.ChainofResponsibiltiy.LogProcessor;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int loglevel, String message){
        System.out.println(loglevel + " " + message);
        if(LogProcessor.ERROR==loglevel){
            System.out.println("Error : " + message);
        }else{
            super.log(loglevel,message);
        }
    }


}
