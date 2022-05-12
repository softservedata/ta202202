package com.softserve.edu.hw11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework11 {
    public static void main(String[] args) {

        System.out.println("Enter your password:"); // I was really tempted to use System.console().readPassword() here
        Scanner userInput = new Scanner(System.in); // but decided not to in order to keep the code simple
        String password = userInput.nextLine();
        userInput.close();

        Map<String, String> regexMap = createMap();
        Pattern pattern = Pattern.compile(regexMap.get("generalRegex"));
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches()) {
            System.out.println("That's a strong password!");
        } else {
            if(didntMatch(password, regexMap.get("numberRegex"))) {
                System.err.println("There has to be at least one number.");
            }
            if(didntMatch(password, regexMap.get("upperRegex"))) {
                System.err.println("There has to be at least one upper case letter.");
            }
            if(didntMatch(password, regexMap.get("lowerRegex"))) {
                System.err.println("There has to be at least one lower case letter.");
            }
            if(didntMatch(password, regexMap.get("specialRegex"))) {
                System.err.println("There has to be at least one special character.");
            }
            if(didntMatch(password, regexMap.get("lengthRegex"))) {
                System.err.println("Password has to be at least 12 symbols long.");
            }
        }
    }

    private static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("generalRegex",
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%^&+=.\\-_*])[a-zA-z\\d@!#$%^&+=*.\\-_]{12,}$");
        map.put("numberRegex", "[0-9]");
        map.put("upperRegex", "[A-Z]");
        map.put("lowerRegex", "[a-z]");
        map.put("specialRegex", "[@!#$%^&+=.\\-_*]");
        map.put("lengthRegex", "^.{12,}$");
        return map;
    }

    private static boolean didntMatch(String password, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return !matcher.find();
    }
}