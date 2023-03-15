import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        Calculator calculator = new Calculator();
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите первое число: ");
                int num1 = scanner.nextInt();
                System.out.print("Введите знак математической операции: ");
                char sign = scanner.next().charAt(0);
                System.out.print("Введите второе число: ");
                int num2 = scanner.nextInt();
                System.out.println("Результат: " + calculator.calculate(num1, num2, sign));
            } 
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
        }
    }
}