package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());
        GuessNumber game = new GuessNumber(player1, player2);
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            } 
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.next();
        }
    }
}