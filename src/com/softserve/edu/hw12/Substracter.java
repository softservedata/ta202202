package com.softserve.edu.hw12;

public class Substracter implements Runnable {
    public void run(){
       subFromSum();
    }
    private void subFromSum(){
            System.out.println("It's Substracter");
            int count;
            for (int i = 0; i < 10; i++) {
                count = i + 1;
                System.out.print("\titeration #" + count + " - " + --ThreadManager.sum + "\n");
            }
            System.out.println();
        }
    }