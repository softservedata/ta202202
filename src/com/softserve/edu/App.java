package com.softserve.edu;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {

    private static final String[] positiveAnswers = {"yes", "y", "ok"};
    private static final String[] negativeAnswers = {"no", "n"};

    public static void main(String[] args) {

        System.out.println("Hello!"+"\n"+"Wanna see me draw a heart drawn with hearts?");
        String answer = getAnswer();
        checkAnswer(answer);
        drawHeart.main();
    }

    private static String getAnswer() {
        Scanner userInput = new Scanner(System.in);
        String answer = userInput.nextLine();
        if (!Arrays.asList(positiveAnswers).contains(answer.toLowerCase(Locale.ROOT)) &&
            !Arrays.asList(negativeAnswers).contains(answer.toLowerCase(Locale.ROOT))) {
            System.err.println("Sorry, I operate only in yes or no answers :(");
            answer = getAnswer();
        }
        return answer;
    }

    private static void checkAnswer(String answer) {
        if(Arrays.asList(positiveAnswers).contains(answer.toLowerCase(Locale.ROOT))) {
            System.out.println("How nice of you! Here you go:");
        }
        else if (Arrays.asList(negativeAnswers).contains(answer.toLowerCase(Locale.ROOT))) {
            System.out.println("Too bad, I'm printing it anyway! >:3");
        }
    }
}
