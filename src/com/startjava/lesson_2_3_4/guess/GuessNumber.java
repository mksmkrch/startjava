package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private int hiddenNumber;
    private static final int MAX_TRY = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.clearAnswers();
        player2.clearAnswers();
        System.out.printf("У каждого игрока по %d попыток\n", MAX_TRY);
        hiddenNumber = (int) (1 + Math.random() * 100);
        while (player1.getTryNumber() < MAX_TRY || player2.getTryNumber() < MAX_TRY) {
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
        //Scanner scanner = new Scanner(System.in);
        int number = new Scanner(System.in).nextInt();
        if (!player.addAnswer(number)) {
            System.out.print("Некорректное число, введите число из диапазона (0, 100]\n");
            inputAnswer(player);
        }
    }

    private boolean compare(Player player) {
        int number = player.getAnswer();
        if (player.getAnswer() == hiddenNumber) {
            System.out.printf("Игрок %s угадал число %d с %d попытки\n", player.getName(), number, player.getTryNumber());
            return true;
        }
        System.out.printf("Число %d %s того, что загадал компьютер\n", number,
                number < hiddenNumber ? "меньше" : "больше");
        if (player.getTryNumber() > 9) {
            System.out.printf("У %s закончились попытки\n", player.getName());
        }
        return false;
    }

    private void outAnswers() {
        System.out.printf("Все ответы %s: %s\n", player1.getName(), player1.getAnswers());
        System.out.printf("Все ответы %s: %s\n", player2.getName(), player2.getAnswers());
    }
}
