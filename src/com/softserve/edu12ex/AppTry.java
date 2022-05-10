package com.softserve.edu12ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppTry {

    public static void main(String[] args) throws IOException {
        int i = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        //try { // finally
            System.out.println("try start");
            i = 10 / 10;
            System.out.println("try end");
        }
//        finally {
//            System.out.println("finally");
//        }

    }

}
