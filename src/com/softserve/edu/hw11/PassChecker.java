package com.softserve.edu.hw11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassChecker {
    public static void main(String[] args) {
        checkPass();
    }
    private static final Scanner scan = new Scanner(System.in);
    private static String password;

    private static void rewritePass(){
        password = scan.nextLine();
    }

    private static void printMessage(String s){
        System.out.println(s);
    }

    private static void checkPass(){
        Regexes[] arr = Regexes.values();
        int count = 0;
        Matcher mat;
        printMessage("Enter password your want to check\n" +
                     "Make sure that your password:\n" +
                     "- contains at least 12 characters, where:\n" +
                     "- at least one capital letter\n" +
                     "- at least one small letter\n" +
                     "- at least one special character from next set:\n" +
                     "@, #, $, %, ^, &, +, =, -, ?, !, _\n");

        while (count < arr.length){
            rewritePass();
            for(Regexes item : arr) {
                mat = item.getPat().matcher(password);
                if (!mat.find()) {
                    printMessage(item.getMessage());
                    count = 0;
                    break;
                }
                count++;
            }
        }
        scan.close();
        printMessage("Well done, this password is OK");
    }
}


enum Regexes {
    LENGTH(".{12,}", "Your password should contain not less than 12 characters. Try again"),
    WHITESPACE("^\\S+$", "Your password should not contain any whitespaces. Try again"),
    CAPITAL("[A-Z]+", "Your password should contain at least one capital letter. Try again"),
    SMALL("[a-z]+", "Your password should contain at least one small letter. Try again"),
    DIGITS("[0-9]+", "Your password should contain at least one digit. Try again"),
    CHAR("[@#$%^&+=-?!_]+", "Your password should contain at least one of next special characters - @, #, $, %, ^, &, +, =, -, ?, !, _. Try again");

    private final String message;
    private final Pattern pat;

    Regexes(String regex, String message){
        this.message = message;
        this.pat = Pattern.compile(regex);
    }

    public Pattern getPat(){
        return this.pat;
    }

    public String getMessage() {
        return this.message;
    }
}
