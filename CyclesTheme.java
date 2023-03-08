public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int sumEvenNums = 0;
        int sumOddNums = 0;
        do {
            if (num % 2 == 0) {
                sumEvenNums += num;
            } else {
                sumOddNums += num;
            }
            num++;
        } while (num <= 21);
        System.out.print("В промежутке [-10, 21] сумма четных чисел = " + sumEvenNums);
        System.out.println(", а нечетных = " + sumOddNums);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if (num2 > max) {
            max = num2;
        } else if (num2 < min) {
            min = num2;
        }
        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int sumDigits = 0;
        while (num1 > 0) {
            int digit = num1 % 10;
            System.out.print(digit);
            sumDigits += digit;
            num1 /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        int intervalStart = 1;
        int intervalEnd = 24;
        for (int i = intervalStart; i < intervalEnd; i += 2) {
            System.out.printf("%2d%s", i, " ");
            count++;
            if (count % 5 == 0) {
                System.out.println();
                count = 0;
            }
        }
        if (count > 0) {
            for (int i = 0; i < 5 - count; i++) {
                System.out.printf("%2d%s", 0, " ");
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        num1 = 3242592;
        count = 0;
        int copyNum1 = num1;
        while (copyNum1 > 0) {
            if (copyNum1 % 10 == 2) {
                count++;
            }
            copyNum1 /= 10; 
        }
        String parity = "(нечетное)";
        if (count % 2 == 0) {
            parity = "(четное)";
        }
        System.out.printf("Число %d содержит %d %s количество двоек \n", num1, count, parity);

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int row = 5;
        while (row >= 1) {
            int column = 1;
            while (row >= column) {
                System.out.print("#");
                column++;
            }
            System.out.println("");
            row--;
        }
        System.out.println();
        row = 1;
        do {
            int column = 1;
            do {
                System.out.print("$");
                column++;
            } while (column <= row  && column <= 6 - row);
            System.out.println();
            row++;
        } while (row <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%s %s\n", "Dec", "Char");
        for (int i = 0; i <= 255; i++) {
            if ((i < 48 && i % 2 != 0) || (i > 96 && i < 123 && i % 2 == 0)) {
                System.out.printf("%3d %4s\n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num1 = 1034301;
        copyNum1 = num1;
        int reversNum = 0;
        while (copyNum1 > 0) {
            reversNum = reversNum * 10 + copyNum1 % 10;
            copyNum1 /= 10;
        }
        if (reversNum == num1) {
            System.out.printf("Число %d является палиндромом", num1);
        } else {
            System.out.printf("Число %d не является палиндромом", num1);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым");
        num1 = 204240;
        copyNum1 = num1;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                sumRightHalf += copyNum1 % 10;
            } else {
                sumLeftHalf += copyNum1 % 10;
            }
            copyNum1 /= 10;
        }
        System.out.printf("Сумма цифр %d = %d\n", num1 / 1000, sumLeftHalf);
        System.out.printf("Сумма цифр %d = %d\n", num1 % 1000, sumRightHalf);
        if (sumLeftHalf == sumRightHalf) {
            System.out.printf("Число %d является счастливым", num1);
        } else {
            System.out.printf("Число %d не является счастливым", num1);
        }

        System.out.println("\n\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("%24s\n" , "ТАБЛИЦА ПИФАГОРА");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int product = i * j;
                if (product != 1) {
                    System.out.printf("%3d", product);
                } else {
                    System.out.printf("%3s", "");
                }
                if (j == 1) {
                    System.out.printf("%2s", "|");
                }
            }
            System.out.println();
            if (i == 1) {
                System.out.print(" ---|");
                for (int j = 2; j < 10; j++) {
                    System.out.print("---");
                }
                System.out.println();
            }
        }
    }
}