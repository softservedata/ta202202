package com.softserve.edu.hw11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework11_alt {
    public static void main(String[] args) {

        System.out.println("Enter your password:");
        Scanner userInput = new Scanner(System.in);
        String password = userInput.nextLine();
        userInput.close();

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%^&+=.\\-_*])[a-zA-z\\d@!#$%^&+=*.\\-_]{12,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches()) {
            System.out.println("That's a strong password!");
        } else {
            HashMap<String, Map<String, String>> regexMap = createMap();
            for (Map.Entry<String, Map<String, String>> rule : regexMap.entrySet()) {
                Map<String, String> value = rule.getValue();
                if (didntMatch(password, value.get("regex"))) {
                    System.err.println(value.get("message"));
                }
            }
        }
    }

    private static HashMap<String, Map<String, String>> createMap() {
        HashMap<String, Map<String, String>> map = new HashMap<>();

        map.put("numberRegex", new HashMap<String, String>() {{
            put("regex", "[0-9]");
            put("message", "There has to be at least one number.");}});
        map.put("upperRegex", new HashMap<String, String>() {{
            put("regex", "[A-Z]");
            put("message", "There has to be at least one upper case letter.");}});
        map.put("lowerRegex", new HashMap<String, String>() {{
            put("regex", "[a-z]");
            put("message", "There has to be at least one lower case letter.");}});
        map.put("specialRegex", new HashMap<String, String>() {{
            put("regex", "[@!#$%^&+=.\\-_*]");
            put("message", "There has to be at least one special character.");}});
        map.put("lengthRegex", new HashMap<String, String>() {{
            put("regex", "^.{12,}$");
            put("message", "Password has to be at least 12 symbols long.");}});
        return map;
    }

    private static boolean didntMatch(String password, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return !matcher.find();
    }
}