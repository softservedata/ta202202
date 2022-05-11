package com.softserve.edu13io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestFileInput {
    public static void main(String[] args) {
        byte[] r = new byte[1000];
        String fileName = "c:/tools/1/test.txt";
        FileInputStream inFile;
        int readByte = -1;
        try {
            inFile = new FileInputStream(fileName);
            System.out.println("Input file was opened.");
            int bytesAv = inFile.available(); // Bytes count
            System.out.println("Bytes count: " + bytesAv + " Bytes");
            //int count = inFile.read(r, 0, bytesAv);
            int count = -1;
            while ((readByte = inFile.read()) > 0) {
                r[++count] = (byte) readByte;
            }
            System.out.println("Was readed: " + count + " bytes.");
            System.out.println(r[0] + " " + r[1] + " " + r[2]);
            System.out.println((char) r[0] + " " + (char) r[1] + " " + (char) r[2]);
            inFile.close();
            System.out.println("Input stream was closed.");
            for (int i = 0; i < bytesAv; i++) {
                if (r[i] != 13) {
                    System.out.print((char) r[i] + " ");
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("File Read/Write Error: " + fileName);
        }
        System.out.println("Array: " + Arrays.toString(r));
    }
}
