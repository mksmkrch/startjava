import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        String yesNo = "yes";
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scanStr.next());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scanStr.next());
        GuessNumber newGame = new GuessNumber(playerOne, playerTwo);
        while (!yesNo.equals("no")) {
            if (yesNo.equals("yes")) {
                newGame.setGameStatus();
                newGame.setHiddenNum((int) (1 + Math.random() * 100));
                while (newGame.isGame()) {
                    newGame.game();
                }
            } 
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                yesNo = scanStr.next();
            } while (!yesNo.equals("yes") && !yesNo.equals("no"));
        }
    }
}