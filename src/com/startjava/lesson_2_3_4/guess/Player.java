package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] answers = new int[10];
    private int tryNumber = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAnswer() {
        return answers[tryNumber - 1];
    }

    public boolean setAnswer(int number) {
        if (number <= 0 || number > 100) {
            return false;
        } else {
            answers[tryNumber++] = number;
            return true;
        }
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public void clearAnswers() {
        Arrays.fill(answers, 0, tryNumber, 0);
        tryNumber = 0;
    }

    public String getAnswers() {
        return Arrays.toString(Arrays.copyOf(answers, tryNumber)).replaceAll("[\\[\\],]", "");
    }
}