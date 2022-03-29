package com.softserve.edu.hw3;

import java.util.Scanner;

public class Sorter {

    public float[] writeToArr() {
        Scanner scan = new Scanner(System.in);
        float[] raw = new float[3];
        for (int i = 0; i < raw.length; i++) {
            System.out.println("Enter " + (i+1) + " number: ");
            raw[i] = scan.nextFloat();
        }
        //scan.close();
        return raw;
    }

    public float[] makeSort(float[] raw) {
        for (int k = 1; k < raw.length; k++) {
            for (int m = 0; m < raw.length-k; m++) {
                if (raw[m] > raw[m+1]) {
                    float help = raw[m];
                    raw[m] = raw[m+1];
                    raw[m+1] = help;
                }
            }
        }
        return raw;
    }

    public void print(float[] raw) {
        System.out.println("The result is:");
        for (float f : raw) {
            System.out.print(f + " ");
        }
        System.out.println();
    }

}


