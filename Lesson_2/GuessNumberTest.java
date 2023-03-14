import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        String answer = "yes";
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scanStr.next());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scanStr.next());
        GuessNumber newGame = new GuessNumber(playerOne, playerTwo);
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                newGame.setGameStatus();
                newGame.setHiddenNum((int) (1 + Math.random() * 100));
                while (newGame.isGameStatus()) {
                    newGame.game();
                }
            } 
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanStr.next();
        }
    }
}