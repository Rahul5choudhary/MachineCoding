package com.example.practice.DesignPatterns.ChainofResponsibiltiy.LogProcessor;

public class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor logProcessor) {
        System.out.println("logProcessor " + logProcessor);
        this.nextLogProcessor = logProcessor;
    }

    public void log(int loglevel, String message) {
        System.out.println("yha");
        if (nextLogProcessor != null) {
            nextLogProcessor.log(loglevel,message);
        }
    }


}
