package com.example.practice.DesignPatterns.ChainofResponsibiltiy.LogProcessor;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int loglevel , String message){
        if(loglevel==LogProcessor.DEBUG){
            System.out.println("Debug : " + message);
        }else{
            super.log(loglevel,message);
        }
    }

}
