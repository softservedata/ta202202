package com.softserve.edu.hw12;


public class ThreadManager {
    public static void main(String[] args) {
        print("MAIN is started");
        Runnable adder = new Adder();
        Runnable substracter = new Substracter();
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(substracter);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            print("t1 has been interrupted");
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            print("t2 has been interrupted");
            e.printStackTrace();
        }
        print("MAIN is finished");
    }

    public static byte sum = 0;
    public static void print(String message){
        System.out.println(message);
    }
}
