package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(int num1, int num2, char sign) {
        switch(sign) {
            case '+' :
                return num1 + num2;
            case '-' :
                return num1 - num2;
            case '*' :
                return num1 * num2;
            case '/' :
                return num1 / num2;
            case '^' :
                int result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '%' :
                return num1 % num2;
        }
        return 0;
    }
}