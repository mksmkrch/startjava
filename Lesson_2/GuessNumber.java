import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int hiddenNum;
    private boolean gameStatus;
    private Scanner scanStr = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        hiddenNum = (int) (1 + Math.random() * 100);
        gameStatus = true;
        do {
            System.out.print(playerOne.getName() + ", введите число: ");
            playerOne.setNum(chekNum(scanStr.nextInt()));
            compare(playerOne.getNum(), playerOne.getName());
            if (gameStatus) {
                System.out.print(playerTwo.getName() + ", введите число: ");
                playerTwo.setNum(chekNum(scanStr.nextInt()));
                compare(playerTwo.getNum(), playerTwo.getName());
            }
        } while (gameStatus);
    }

    private void compare(int playerNum, String playerName) {
        if (playerNum == hiddenNum) {
            System.out.println(playerName + " победил!");
            gameStatus = false;
        } else if (playerNum < hiddenNum) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNum);
        } else {
            System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
        }
    }

    private int chekNum(int num) {
        while (num <= 0 || num > 100) {
            System.out.print("Некорректное число, введите число из диапазона (0, 100]\n");
            num = scanStr.nextInt();
        }
        return num;
    }
}

