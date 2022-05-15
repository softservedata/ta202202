package com.softserve.edu.hw12;

public class Homework12 {

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new Run1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Run2();
        Thread t2 = new Thread(r2);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Main done");
    }
}
