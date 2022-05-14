package com.softserve.edu.hw12;

public class Adder implements Runnable {
    public void run() {
        addToSum();
    }

    private void addToSum() {
            System.out.println("It's Adder");
            int count;
            for (int i = 0; i < 10; i++) {
                count = i + 1;
                System.out.print("\titeration #" + count + " - " + ++ThreadManager.sum + "\n");
            }
            System.out.println();
        }
    }
