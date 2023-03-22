package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {2, 4, 1, 3, 6, 7, 5};
        outIntArr(intArr);
        int len = intArr.length;
        for (int i = 0; i < len; i++) {
            len--;
            int temp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = temp;
        }
        outIntArr(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        int result = 1;
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
            if (i > 0 && i < len - 1) {
                result *= intArr[i];
                System.out.print(intArr[i] + (i < len - 2 ? " * " :  " = " + result));
            }
        }
        System.out.println("\n" + intArr[0] + " с индексом 0; " + intArr[len - 1] + " с индексом 9");

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        outDoubleArr(doubleArr);
        double middleCellValue = doubleArr[len / 2];
        int countZero = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                countZero++;
            }
        }
        outDoubleArr(doubleArr);
        System.out.println("Количество обнуленных ячеек: " + countZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        StringBuilder str = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            System.out.println(str.append(alphabet[i]));
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            int num;
            do {
                num = (int) (60 + Math.random() * 40);
            } while (!checkNum(num, intArr, i));
            intArr[i] = num;
            sortArr(intArr, i);
        }
        outIntArr(intArr);

        System.out.println("6. Копирование не пустых строк");
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        outStringArr(stringArr);
        len = 0;
        for (String string : stringArr) {
            if (!string.isBlank()) {
                len++;
            }
        }
        String[] stringArr2 = new String[len];
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
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                System.out.printf("%6d ", (int) arr[i]);
            } else {
                System.out.printf("%6.3f ", arr[i]);
            }
            if (i == len / 2) {
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
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
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
        int len = arr1.length;
        for (int i = 0; i < len; i++) {
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
