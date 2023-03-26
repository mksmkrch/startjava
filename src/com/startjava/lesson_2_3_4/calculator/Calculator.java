package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        if (!expression.matches("[^\\- ]?\\d+ [+\\-*/^%] [^\\- ]?\\d+")) {
            throw new RuntimeException("\nВыражение введено некорректно!\n" +
                    "Операции возможны только с целыми положительными числами.\n" +
                    "Возможные операции: +, -, *, /, ^, %.\n" +
                    "Введите выражение формата: \"число операция число\".\n");
        }
        String[] expressionParts = expression.split(" ");
        int num1 = Integer.parseInt(expressionParts[0]);
        char sign = expressionParts[1].charAt(0);
        int num2 = Integer.parseInt(expressionParts[2]);
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> ((double) num1) / num2;
            case '^' -> Math.pow(num1, num2);
            case '%' -> Math.abs(Math.IEEEremainder(num1, num2));
            default -> 0;
        };
    }
}