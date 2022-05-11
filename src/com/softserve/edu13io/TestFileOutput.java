package com.softserve.edu13io;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutput {
    public static void main(String[] args) {
        byte[] w = {48, 49, 50};
        String fileName = "c:/tools/1/test.txt";
        FileOutputStream outFile = null;
        try {
            outFile = new FileOutputStream(fileName);
            System.out.println("Output file was opened.");
            outFile.write(w);
            System.out.println("Saved: " + w.length + " bytes.");
            //outFile.close();
            System.out.println("Output stream was closed.");
        } catch (IOException e) {
            System.out.println("File Write Error: " + fileName + "  msg = " + e.getMessage());
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                }
            }
        }
    }
}
