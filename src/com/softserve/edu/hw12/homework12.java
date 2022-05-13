package com.softserve.edu.hw12;

public class homework12 {
    public static void main(String[] args) {

        System.out.println("Main thread started.\n");

        Runnable runnable1 = () -> System.out.println("Anonymous Runnable thread is running.");
        Runnable runnable2 = new DhvozDeclaredRunnable();

        Thread[] threads = {
                new Thread(runnable1),
                new Thread(runnable2),
                new DhvozThread()
        };

        for (Thread thread : threads) {
            System.out.print("Thread ID - " + thread.getId() + ". ");
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getClass() + " exception was thrown.");
            }
        }

        System.out.println("\nMain thread finished.");
    }
}
