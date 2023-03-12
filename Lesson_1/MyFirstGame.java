public class MyFirstGame {

    public static void main(String[] args) {
        int hiddenNum = 47;
        int playerNum = 49;
        while (playerNum != hiddenNum) {
            if (playerNum < hiddenNum) {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNum);
                playerNum ++;
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNum);
                playerNum -= 4;
            }
        }
        System.out.println("Вы победили!");
    }
}