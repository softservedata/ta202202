package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework3 {

    private static final int arrayLength = 3;

    public static void main(String[] args) throws InterruptedException {

        introduce();
        Scanner userInput = new Scanner(System.in);
        String answer = userInput.nextLine();
        Float[] numbersArray = getNumbersArray(userInput, answer);
        userInput.close();
        System.out.println("Here's the unsorted array: " + Arrays.toString(numbersArray));
        Thread.sleep(2000);
        think();
        Arrays.sort(numbersArray, Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println("Here's the sorted array: " + Arrays.toString(numbersArray) + " Ta-da!");
    }

    private static void introduce() {
        System.out.println("Hi! Today I'll sort three numbers of your choice!");
        System.out.println("Be warned - all NaN's will be thrown out and turned into nulls!");
        System.out.print("Gimme your numbers separated by spaces or line breaks:");
    }

    private static Float[] getNumbersArray(Scanner userInput, String answer) {
        if (checkForSpaces(answer)) {
            return splitStringIntoNumbers(answer);
        }
        else {
            Float[] numbers = new Float[arrayLength];
            floatOrNaN(answer, numbers, 0);
            for(int i = 1; i < arrayLength; i++) {
                System.out.println("Oh, so you like line breaks. Gimme another one then!");
                answer = userInput.nextLine();
                floatOrNaN(answer, numbers, i);
            }
            return numbers;
        }
    }

    private static void floatOrNaN(String answer, Float[] numbers, int i) {
        Scanner scanner = new Scanner(answer);
        if (scanner.hasNextFloat()) {
            numbers[i] = Float.parseFloat(answer);
        }
        else {
            numbers[i] = null;
            System.err.println("That was not a number :( - " + answer);
        }
    }

    private static boolean checkForSpaces(String answer) {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(answer);
        return matcher.find();
    }

    private static Float[] splitStringIntoNumbers(String answer) {
        Scanner scanner = new Scanner(answer);
        Float[] numbers = new Float[0];
        while (scanner.hasNext()) {
            if (scanner.hasNextFloat()) {
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
                numbers[numbers.length - 1] = scanner.nextFloat();
            }
            else {
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
                numbers[numbers.length - 1] = null;
                System.err.println("One of those is not a number :( - " + scanner.next());
            }
        }
        scanner.close();
        return numbers;
    }

    public static void think() throws InterruptedException {
        System.out.print("Thinking");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print("."+"\n");
        Thread.sleep(500);
    }
}
