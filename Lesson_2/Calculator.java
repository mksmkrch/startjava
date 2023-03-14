public class Calculator {

    private int result;

    public int calculation(int numA, int numB, char sign) {
        switch(sign) {
            case '+' :
                result = numA + numB;
                break;
            case '-' :
                result = numA - numB;
                break;
            case '*' :
                result = numA * numB;
                break;
            case '/' :
                result = numA / numB;
                break;
            case '^' :
                result = numA;
                for (int i = 1; i < numB; i++) {
                    result *= numA;
                }
                break;
            case '%' :
                result = numA % numB;
        }
        return result;
    }
}