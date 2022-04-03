package com.softserve.edu.hw3;

import java.util.Scanner;

class Sorter {
    private static final float[] raw = new float[3];

    static {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < raw.length; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            raw[i] = scan.nextFloat();
        }
        scan.close();
        makeSort();
        System.out.println();
    }

    private static void makeSort() {
        for (int k = 1; k < Sorter.raw.length; k++) {
            for (int m = 0; m < Sorter.raw.length - k; m++) {
                if (Sorter.raw[m] > Sorter.raw[m + 1]) {
                    float help = Sorter.raw[m];
                    Sorter.raw[m] = Sorter.raw[m + 1];
                    Sorter.raw[m + 1] = help;
                }
            }
        }
    }

    public void print() {
        System.out.println("The result is:");
        for (float f : raw) {
            System.out.print(f + "\t\t");
        }
        System.out.println();
    }
}


