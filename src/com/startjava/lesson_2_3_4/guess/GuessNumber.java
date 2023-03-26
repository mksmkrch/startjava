package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private int hiddenNumber;
    private final Scanner scanner = new Scanner(System.in);
    private static final int maxTry = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.clearAnswers();
        player2.clearAnswers();
        System.out.printf("У каждого игрока по %d попыток\n", maxTry);
        hiddenNumber = (int) (1 + Math.random() * 100);
        while (player1.getTryNumber() < maxTry || player2.getTryNumber() < maxTry) {
            if (makeMove()) break;
        }
        outAnswers();
    }

    private boolean makeMove() {
        inputAnswer(player1);
        if (compare(player1)) return true;
        inputAnswer(player2);
        return compare(player2);
    }

    private void inputAnswer(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        int number = scanner.nextInt();
        if (!player.setAnswer(number)) {
            System.out.print("Некорректное число, введите число из диапазона (0, 100]\n");
            inputAnswer(player);
        }
    }

    private boolean compare(Player player) {
        if (player.getAnswer() == hiddenNumber) {
            return outWinMessage(player);
        }
        return outFailureMessage(player);
    }

    private boolean outWinMessage(Player player) {
        int number = player.getAnswer();
        String name = player.getName();
        int tryNumber = player.getTryNumber();
        System.out.printf("Игрок %s угадал число %d с %d попытки\n", name, number, tryNumber);
        return true;
    }

    private boolean outFailureMessage(Player player) {
        int number = player.getAnswer();
        String name = player.getName();
        int tryNumber = player.getTryNumber();
        System.out.printf("Число %d %s того, что загадал компьютер\n", number,
                number < hiddenNumber ? "меньше" : "больше");
        if (tryNumber > 9) {
            System.out.printf("У %s закончились попытки\n", name);
        }
        return false;
    }

    private void outAnswers() {
        System.out.printf("Все ответы %s: %s\n", player1.getName(), player1.getAnswers());
        System.out.printf("Все ответы %s: %s\n", player2.getName(), player2.getAnswers());
    }
}
