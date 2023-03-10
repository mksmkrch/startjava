public class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int numA = 5;
        int numB = 3;
        char sign = '^';
        int result = numA;
        if (sign == '+') {
            result = numA + numB;
        } else if (sign == '-') {
            result = numA - numB;
        } else if (sign == '*') {
            result = numA * numB;
        } else if (sign == '/') {
            result = numA / numB;
        } else if (sign == '^') {
            for (int i = 1; i < numB; i++) {
                result *= numA;
            }
        } else if (sign == '%') {
            result = numA % numB;
        }
        System.out.println(numA + " " + sign + " " + numB + " = " + result);
    }
}