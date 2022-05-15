package com.softserve.edu.hw12;

public class Run1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First runner " + i);
        }

    }
}
