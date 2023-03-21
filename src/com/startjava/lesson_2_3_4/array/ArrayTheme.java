package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] nums = {2, 4, 1, 3, 6, 7, 5};
        for (int num: nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length / 2; i++) {
            int bufNum = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = bufNum;
        }
        System.out.println();
        for (int num: nums) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] nums2 = new int[10];
        int result = 1;
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = i;
            if (i > 0 && i < 9) {
                result *= nums2[i];
                System.out.print(nums2[i] < 8 ? nums2[i] + " * " : nums2[i] + " = " + result);
            }
        }
        System.out.println("\n" + nums2[0] + " с индексом 0; " + nums2[nums2.length-1] + " с индексом 9");

        System.out.println("\n3. Удаление элементов массива");
        double[] nums3 = new double[15];
        for (int i = 0; i < 15; i++) {
            nums3[i] = Math.random();
            System.out.printf("%.3f ", nums3[i]);
            if (i == nums3.length / 2) {
                System.out.println();
            }
        }
    }
}
