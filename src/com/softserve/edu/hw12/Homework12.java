package com.softserve.edu.hw12;

public class Homework12 {
public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new ThreadHomework12());
    Thread t2 = new Thread(new ThreadHomework12());
    System.out.println("Main thread started. ID: " + Thread.currentThread().getId());
    System.out.println("Main thread alive status: " + Thread.currentThread().isAlive());

    t1.start();
    System.out.println("Thread " + t1.getId() + " alive status: " + t1.isAlive());
    t1.join();

    t2.start();
    System.out.println("Thread " + t2.getId() + " alive status: " + t2.isAlive());
    t2.join();

    System.out.println("Thread " + t1.getId() + " alive status: " + t1.isAlive());
    System.out.println("Thread " + t2.getId() + " alive status: " + t2.isAlive());
    System.out.println("Main thread is done.");
    }
}
