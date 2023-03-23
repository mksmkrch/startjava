package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {2, 4, 1, 3, 6, 7, 5};
        outIntArr(intArr);
        int len = intArr.length;
        for (int i = 0; i < len; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[--len];
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
        System.out.println();
        double middleCellValue = doubleArr[len / 2];
        int stepCountZero = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                stepCountZero++;
            }
        }
        outDoubleArr(doubleArr);
        System.out.println("Количество обнуленных ячеек: " + stepCountZero);

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
        int[] uniqueNums = new int[30];
        len = uniqueNums.length;
        for (int i = 0; i < len; i++) {
            int num = (int) (60 + Math.random() * 40);
            if (isUniqueNum(num, uniqueNums, i)) {
                uniqueNums[i] = num;
            } else {
                i--;
            }
        }
        sortArr(uniqueNums);
        outIntArr(uniqueNums);

        System.out.println("6. Копирование не пустых строк");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        outStrArr(srcArr);
        len = 0;
        for (String string : srcArr) {
            if (!string.isBlank()) {
                len++;
            }
        }
        String[] destArr = new String[len];
        copyStrings(srcArr, destArr);
        outStrArr(destArr);
    }

    private static void outIntArr(int[] arr) {
        int i = 0;
        for (int num : arr) {
            System.out.print(i % 10 == 9 ? num + "\n" : num + " ");
            i++;
        }
        System.out.println();
    }

    private static void outDoubleArr(double[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.printf("%.3f ", arr[i]);
            if (i == len / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    private static boolean isUniqueNum(int num, int[] arr, int stepCount) {
        for (int i = 0; i < stepCount; i ++) {
            if (arr[i] == num) {
                return false;
            }
        }
        return true;
    }

    private static void sortArr(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void outStrArr(String[] arr) {
        for (String string : arr) {
            System.out.print("\"" + string + "\"" + " ");
        }
        System.out.println();
    }

    private static void copyStrings(String[] arr, String[] arr2) {
        int stepCount = 0;
        int j = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (!arr[i].isBlank()) {
                stepCount++;
            } else if (stepCount > 0) {
                System.arraycopy(arr, i - stepCount, arr2, j, stepCount);
                j += stepCount;
                stepCount = 0;
            }
        }
    }
}
