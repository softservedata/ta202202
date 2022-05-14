package com.softserve.edu.hw12;

public class Homework12 {
public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new ThreadHomework12());
    Thread t2 = new Thread(new ThreadHomework12());
    System.out.println("Main thread started. ID: " + Thread.currentThread().getId());
    t1.start();
    t1.join();
    t2.start();
    t2.join();
    System.out.println("Main thread is done.");
    }
}
