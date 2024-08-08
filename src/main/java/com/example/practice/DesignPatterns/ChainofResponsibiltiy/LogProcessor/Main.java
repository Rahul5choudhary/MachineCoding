package com.example.practice.DesignPatterns.ChainofResponsibiltiy;

import com.example.practice.DesignPatterns.ChainofResponsibiltiy.LogProcessor.ErrorLogProcessor;
import com.example.practice.DesignPatterns.ChainofResponsibiltiy.LogProcessor.LogProcessor;

public class Main {

    public static void main(String[] args) {
//        LogProcessor logProcessor = new InfoLogProcessor( new DebugLogProcessor(new ErrorLogProcessor(null)));


        LogProcessor logProcessor1 = new ErrorLogProcessor(null);
//        logProcessor1.log(LogProcessor.ERROR,"Exception");
        logProcessor1.log(LogProcessor.INFO,"Info");

//        logProcessor.log(LogProcessor.ERROR,"Exception happens");
//        logProcessor.log(LogProcessor.DEBUG,"need to deug this");
//        logProcessor.log(LogProcessor.INFO,"just for info");
    }


}


//ErrorLogProcessorr ==> it will first go log method of this class then as the Error and Log does not matches it will print nothing
//then else part will be executed then super will be called which will basically call the LogProcessor and it will check here for the next LogProcessor will be available it will call that class other wise
//it will end there.
