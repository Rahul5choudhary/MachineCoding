package com.example.practice.MultiThreading;

import java.util.Stack;

public class SynchronizedExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        Thread t1 = new Thread() {
            public void run() {
                System.out.println("xx");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("xx");
            }
        };

        t1.start();
    }


}
