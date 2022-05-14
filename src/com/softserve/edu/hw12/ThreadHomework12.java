package com.softserve.edu.hw12;

public class ThreadHomework12 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Secondary thread started. ID: " + Thread.currentThread().getId());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
