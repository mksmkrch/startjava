import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        String yesNo = "yes";
        Calculator calculator = new Calculator();
        do {
            if (yesNo.equals("yes")) {
                System.out.print("Введите первое число: ");
                int numA = scanStr.nextInt();
                System.out.print("Введите знак математической операции: ");
                char sign = scanStr.next().charAt(0);
                System.out.print("Введите второе число: ");
                int numB = scanStr.nextInt();
                System.out.println("Результат: " + calculator.calculation(numA, numB, sign));
            } 
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                yesNo = scanStr.next();
            } while (!yesNo.equals("yes") && !yesNo.equals("no"));
        } while (!yesNo.equals("no"));
    }
}