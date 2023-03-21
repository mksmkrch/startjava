package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {2, 4, 1, 3, 6, 7, 5};
        outIntArr(intArr);
        int lenArr = intArr.length;
        for (int i = 0; i < lenArr / 2; i++) {
            int bufNum = intArr[i];
            intArr[i] = intArr[lenArr - 1 - i];
            intArr[lenArr - 1 - i] = bufNum;
        }
        outIntArr(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        int result = 1;
        lenArr = intArr.length;
        for (int i = 0; i < lenArr; i++) {
            intArr[i] = i;
            if (i > 0 && i < 9) {
                result *= intArr[i];
                System.out.print(intArr[i] < 8 ? intArr[i] + " * " : intArr[i] + " = " + result);
            }
        }
        System.out.println("\n" + intArr[0] + " с индексом 0; " + intArr[lenArr-1] + " с индексом 9");

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        lenArr = doubleArr.length;
        for (int i = 0; i < lenArr; i++) {
            doubleArr[i] = Math.random();
        }
        outDoubleArr(doubleArr);
        double meanCell = doubleArr[lenArr / 2];
        int countNull = 0;
        for (int i = 0; i < lenArr; i++) {
            if (doubleArr[i] > meanCell) {
                doubleArr[i] = 0;
                countNull++;
            }
        }
        outDoubleArr(doubleArr);
        System.out.println("Количество обнуленных ячеек: " + countNull);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        char symbol = 'A';
        for (int i = 0; i < 26; symbol++, i++) {
            charArr[i] = symbol;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 25; i >= 0; i--) {
            System.out.println(str.append(charArr[i]));
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        for (int i = 0; i < 30; i++) {
            do {
                intArr[i] = (int) (60 + Math.random() * 40);
            } while (!checkNum(intArr[i], intArr, i));
            sortArr(intArr, i);
        }
        outIntArr(intArr);

        System.out.println("6. Копирование не пустых строк");
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        outStringArr(stringArr);
        lenArr = 0;
        for (String string : stringArr) {
            if (!string.isBlank()) {
                lenArr++;
            }
        }
        String[] stringArr2 = new String[lenArr];
        copyString(stringArr, stringArr2);
        outStringArr(stringArr2);
    }

    private static void outIntArr(int[] arr) {
        int i = 0;
        for (int num: arr) {
            System.out.print(i % 10 == 9 ? num + "\n" : num + " ");
            i++;
        }
        System.out.println();
    }

    private static void outDoubleArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.printf("%5d ", (int) arr[i]);
            } else {
                System.out.printf("%.3f ", arr[i]);
            }
            if (i == arr.length / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }
    private static boolean checkNum(int num, int[] arr, int count) {
        for (int i = 0; i < count; i ++) {
            if (arr[i] == num) {
                return false;
            }
        }
        return true;
    }

    private static void sortArr(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            if (arr[i] > arr[count]) {
                int bufNum = arr[count];
                arr[count] = arr[i];
                arr[i] = bufNum;
            }
        }
    }

    private static void outStringArr(String[] arr) {
        for (String string : arr) {
            System.out.print("\"" + string + "\"" + " ");
        }
        System.out.println();
    }

    private static void copyString(String[] arr1, String[] arr2) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].isBlank()) {
                count++;
            } else if (count > 0) {
                System.arraycopy(arr1, i - count, arr2, j, count);
                j += count;
                count = 0;
            }
        }
    }
}
