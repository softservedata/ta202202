package com.softserve.edu.hw13;

import java.io.*;


public class Homework13 {
    public static void main(String[] args) {
        replaceFileText("src/com/softserve/edu/hw13/test.txt");
    }
    static void replaceFileText (String filePath) {
        File textFile = new File(filePath);
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(textFile));
            String line =  br.readLine();
            StringBuilder writeText = new StringBuilder();
            while (line != null) {
                System.out.println("Original line: " + line); //added for logging...
                String lineToWrite = line.replaceAll("([Ww]{1})([Ee]{1})([Ll]{1})([Cc]{1})([Oo]{1})([Mm]{1})([Ee]{1})",
                        "Hello");
                System.out.println("Updated line: " + lineToWrite); //added for logging...
                writeText.append(lineToWrite).append("\n");
                line = br.readLine();
            }
            bw = new BufferedWriter(new FileWriter(textFile));
            bw.write(writeText.toString());
            bw.flush();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally.");
            try {
                if (br!= null) {
                    br.close();
                }
                if (bw!= null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
