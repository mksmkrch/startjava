package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                try {
                    double result = Calculator.calculate(expression);
                    System.out.printf("%s = %" + (result - Math.floor(result) < .001 ? ".0" : ".3") + "f\n",
                            expression, result);
                    answer = "no";
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (!answer.equals("yes")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
        }
    }
}