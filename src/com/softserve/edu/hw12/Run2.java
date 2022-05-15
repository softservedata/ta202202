package com.softserve.edu.hw12;

public class Run2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Second runner " + i);
        }

    }
}
