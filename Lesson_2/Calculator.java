public class Calculator {

    public int calculate(int num1, int num2, char sign) {
        int result = 1;
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
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            case '%' :
                return num1 % num2;
        }
        return result;
    }
}