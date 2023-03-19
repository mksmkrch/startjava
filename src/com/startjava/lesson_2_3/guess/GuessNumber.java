package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int hiddenNum;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        hiddenNum = (int) (1 + Math.random() * 100);
        while (makeMove(player1) && makeMove(player2)) {}
    }

    private boolean makeMove(Player player) {
        inputNum(player);
        return compare(player);
    }

    private void inputNum(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        int num = scanner.nextInt();
        while (num <= 0 || num > 100) {
            System.out.print("Некорректное число, введите число из диапазона (0, 100]\n");
            num = scanner.nextInt();
        }
        player.setNum(num);
    }

    private boolean compare(Player player) {
        int playerNum = player.getNum();
        if (playerNum == hiddenNum) {
            System.out.println(player.getName() + " победил!");
            return false;
        }
        if (playerNum < hiddenNum) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNum);
        } else {
            System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
        }
        return true;
    }
}

