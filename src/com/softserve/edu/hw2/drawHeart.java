package com.softserve.edu.hw2;

public class drawHeart {

    public static void main() { //proudly stolen from https://stackoverflow.com/questions/63934144/draw-a-heart-in-ascii-art-style-based-on-user-input
        int n = 4;
        for (int y = -n; y <= 2 * n; y++) {
            for (int x = -2 * n; x <= 2 * n; x++)
                if ((y <= 0 &&
                        ((int) Math.sqrt((x+n)*(x+n) + y*y) <= n
                                || (int) Math.sqrt((x-n)*(x-n) + y*y) <= n))
                        || (y > 0 && Math.abs(x) <= 2 * n - y))
                    System.out.print("♥ ");
                else
                    System.out.print("♡ ");
            System.out.println();
        }
    }
}
