package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private final Player[] players;
    private int hiddenNumber;
    private static final int MAX_TRY = 10;
    private static final int MAX_ROUNDS = 3;

    public GuessNumber(Player... newPlayers) {
        this.players = newPlayers;
    }

    public void start() {
        for (Player player : players) {
            player.resetScore();
        }
        castLots();
        for (int round = 0; round < MAX_ROUNDS; round++) {
            for (Player player : players) {
                player.clearAnswers();
            }
            System.out.printf("РАУНД %d\nУ каждого игрока по %d попыток\n", round + 1, MAX_TRY);
            hiddenNumber = (int) (1 + Math.random() * 100);
            for (int attempt = 0; attempt < MAX_TRY; attempt++) {
                if (makeMove()) break;
            }
            outAnswers();
        }
        System.out.println(determineWinner());
    }

    private void castLots() {
        for (int i = players.length - 1; i >= 0; i--) {
            int num = (int) (Math.random() * (i + 1));
            Player copyPlayer = players[num];
            players[num] = players[i];
            players[i] = copyPlayer;
        }
        System.out.println("Игроки бросили жребий");
    }

    private boolean makeMove() {
        for (Player player : players) {
            inputAnswer(player);
            if (compare(player)) return true;
        }
        return false;
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
            player.setScore();
            return true;
        }
        System.out.printf("Число %d %s того, что загадал компьютер\n", number,
                number < hiddenNumber ? "меньше" : "больше");
        if (player.getTryNumber() == MAX_TRY) {
            System.out.printf("У %s закончились попытки\n", player.getName());
        }
        return false;
    }

    private void outAnswers() {
        for (Player player : players) {
            System.out.printf("Все ответы %s: %s\n", player.getName(), player.getAnswers());
        }
    }

    private String determineWinner() {
        int maxWins = 0;
        int allWins = 0;
        for (Player player : players) {
            if (player.getScore() > maxWins && player.getScore() > 0) {
                maxWins = player.getScore();
                allWins += player.getScore();
            }
        }
        if (maxWins == 0 || allWins == MAX_ROUNDS && maxWins == allWins / players.length) {
            return "Никто не выиграл";
        } else {
            Player[] potentialWinners = new Player[players.length - 1];
            int len = 0;
            for (Player player : players) {
                if (player.getScore() == maxWins) {
                    potentialWinners[len++] = player;
                }
            }
            Player[] winners = Arrays.copyOf(potentialWinners, len);
            StringBuilder string = new StringBuilder(len > 1 ? "Победили: \n" : "Победил ");
            for (Player winner : winners) {
                string.append(winner.getName()).append("\n");
            }
            return string.toString();
        }
    }
}
