package com.softserve.edu.hw3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the first number of type \"integer\": ");
        int numberOne = Integer.parseInt(bufReader.readLine());
        System.out.println("Please enter the second number of type \"integer\": ");
        int numberTwo = Integer.parseInt(bufReader.readLine());
        System.out.println("Please enter the third number of type \"integer\": ");
        int numberThree = Integer.parseInt(bufReader.readLine());

        int[] myNumbers = {numberOne, numberTwo, numberThree};
        Arrays.sort(myNumbers);

        for (int i = 0; i < myNumbers.length; i ++)
        {
            System.out.println(myNumbers[i]);
        }
    }
}
