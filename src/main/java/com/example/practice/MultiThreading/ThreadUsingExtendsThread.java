package com.example.practice.MultiThreading;

public class ThreadUsingExtendsThread extends Thread {

    ThreadUsingExtendsThread() {
        super("Demo Thread");
        System.out.println("Child Thread Started " + this);
        start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread is running : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
        System.out.println("Exiting Child Thread");
    }

    public static void main(String[] args) {
        ThreadUsingExtendsThread x = new ThreadUsingExtendsThread();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread is running : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException();
            }

        }
        System.out.println("Exiting Main Thread");

    }

}
