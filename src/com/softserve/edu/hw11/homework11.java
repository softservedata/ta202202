package com.softserve.edu.hw11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework11 {
    public static void main(String[] args) {

        System.out.println("Enter your password:"); // I was really tempted to use System.console().readPassword() here
        Scanner userInput = new Scanner(System.in); // but decided not to in order to keep the code simple
        String password = userInput.nextLine();
        userInput.close();

        // checks individually for digits, lowercase, uppercase and specials then checks for length
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%^&+=.\\-_*])[a-zA-z\\d@!#$%^&+=*.\\-_]{12,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches()) {
            System.out.println("That's a strong password!");
        } else {
            if(!findNumber(password)) {
                System.err.println("There has to be at least one number.");
            }
            if(!findUpperCase(password)) {
                System.err.println("There has to be at least upper case letter.");
            }
            if(!findLowerCase(password)) {
                System.err.println("There has to be at least lower case letter.");
            }
            if(!findSpecial(password)) {
                System.err.println("There has to be at least one special character.");
            }
            if(!findLength(password)) {
                System.err.println("Password has to be at least 12 symbols long.");
            }
        }
    }

    private static boolean findMatch(String password, String numberRegex) {
        Pattern numberPattern = Pattern.compile(numberRegex);
        Matcher matcher = numberPattern.matcher(password);
        return matcher.find();
    }

    private static boolean findNumber(String password) {
        String numberRegex = "[0-9]";
        return findMatch(password, numberRegex);
    }

    private static boolean findUpperCase(String password) {
        String upperRegex = "[A-Z]";
        return findMatch(password, upperRegex);
    }

    private static boolean findLowerCase(String password) {
        String lowerRegex = "[a-z]";
        return findMatch(password, lowerRegex);
    }

    private static boolean findSpecial(String password) {
        String specialRegex = "[@!#$%^&+=.\\-_*]";
        return findMatch(password, specialRegex);
    }

    private static boolean findLength(String password) {
        String lengthRegex = "^.{12,}$";
        return findMatch(password, lengthRegex);
    }
}