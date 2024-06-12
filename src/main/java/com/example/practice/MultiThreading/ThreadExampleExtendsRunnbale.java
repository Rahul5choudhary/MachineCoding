package com.example.practice.MultiThreading;

public class ThreadExampleExtendsRunnbale implements Runnable {
    Thread t;
//    Thread t2;

    ThreadExampleExtendsRunnbale() {
        t = new Thread(this, "Demo Thread");
        System.out.println("New Thread is started with name : " + t.getName());
        t.start();

//        t2 = new Thread(this, "Demo Thread 2");
//        System.out.println("New Thread is started with name : " + t2.getName());
//        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child Thread is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting child thread");
    }

    public static void main(String[] args) {
        ThreadExampleExtendsRunnbale nw = new ThreadExampleExtendsRunnbale();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread is running " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                throw new RuntimeException();
            }
        }
        System.out.println("Exiting Main Thread");
    }
}
