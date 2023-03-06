public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int summEvenNumber = 0;
        int summOddNumber = 0;
        do {
            if (i % 2 == 0) {
                summEvenNumber += i;
            } else {
                summOddNumber += i;
            }
            i++;
        } while (i <= 21);
        System.out.print("В промежутке [-10, 21] сумма четных чисел = " + summEvenNumber);
        System.out.println(", а нечетных = " + summOddNumber);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num1;
        int minNum = num1;
        if (num2 > maxNum) {
            maxNum = num2;
        } else if (num2 < minNum) {
            minNum = num2;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        } else if (num3 < minNum) {
            minNum = num3;
        }
        for (i = maxNum -1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int digit = 0;
        int sumDigit = 0;
        while (num1 > 0) {
            digit = num1 % 10;
            System.out.print(digit);
            sumDigit += digit;
            num1 /= 10;
        }
        System.out.println("\n" + sumDigit);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        num1 = 1;
        num2 = 24;
        for (i = num1; i < num2; i += 2) {
            System.out.printf("%2d%s", i, " ");
            count++;
            if (count % 5 == 0 && i != num2 - 1) {
                System.out.println();
                count = 0;
            }
        }
        if (count != 0) {
            for (i = 0; i < 5 - count; i++) {
                System.out.printf("%2d%s", 0, " ");
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        num1 = 3242592;
        count = 0;
        int bufferNum = num1;
        while (bufferNum != 0) {
            if (bufferNum % 10 == 2) {
                count++;
            }
            bufferNum /= 10; 
        }
        String word;
        if (count % 2 == 0) {
            word = "(четное)";
        } else {
            word = "(нечетное)";
        }
        System.out.printf("Число %d содержит %d %s количество двоек \n", num1, count, word);

        System.out.println("\n6. Отображение фигур в консоли");
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        i = 5;
        while (i > 0) {
            int j = 0;
            while (i > j) {
                System.out.print("#");
                j++;
            }
            System.out.println("");
            i--;
        }
        i = 0;
        do {
            int j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j < i + 1 && 5 - i > j);
            System.out.println("");
            i++;
        } while (i < 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%s %s\n", "Dec", "Char");
        for (i = 0; i <= 255; i++) {
            if ((i < 48 && i % 2 != 0) || (i > 96 && i < 123 && i % 2 == 0)) {
                System.out.printf("%3d %4s\n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num1 = 1234321;
        bufferNum = num1;
        int reversNum = 0;
        while (bufferNum > 0) {
            reversNum = reversNum * 10 + bufferNum % 10;
            bufferNum /= 10;
        }
        if (reversNum == num1) {
            System.out.printf("Число %d является палиндромом", num1);
        } else {
            System.out.printf("Число %d не является палиндромом", num1);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым");
        num1 = 204240;
        bufferNum = num1;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        for (i = 0; i < 6; i++) {
            if (i < 3) {
                sumRightHalf += bufferNum % 10;
            } else {
                sumLeftHalf += bufferNum % 10;
            }
            bufferNum /= 10;
        }
        System.out.printf("Сумма цифр %d = %d\n", num1 / 1000, sumLeftHalf);
        System.out.printf("Сумма цифр %d = %d\n", num1 % 1000, sumRightHalf);
        if (sumLeftHalf == sumRightHalf) {
            System.out.printf("Число %d является счастливым\n", num1);
        } else {
            System.out.printf("Число %d не является счастливым\n", num1);
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("%24s\n" , "ТАБЛИЦА ПИФАГОРА");
        for (int row = 1; row < 10; row++) {
            for (int column = 1; column < 10; column++) {
                int numProduct = row * column;
                if (numProduct != 1) {
                    System.out.printf("%3d", numProduct);
                } else {
                    System.out.printf("%3s", "");
                }
                if (column == 1) {
                    System.out.printf("%2s", "|");
                }
            }
            System.out.println();
            if (row == 1) {
                System.out.print(" ---|");
                for (int column = 2; column < 10; column++) {
                    System.out.print("---");
                }
                System.out.println();
            }
        }
    }
}