package com.HomeTasks.week2;

import utils.ArrayUtils;

/**
 * Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class _06_HomeworkWeek2 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillRandomArray(10, 0, 101);
        ArrayUtils.printArray(array);
        System.out.println();
        if (array.length % 2 == 0) {
            int half = array.length / 2;
            int[] firstHalf = new int[half];
            int[] secondHalf = new int[half];

            int sum1 = 0;
            int sum2 = 0;

            int[] first = new int[half];
            int[] second = new int[half];


            for (int i = 0; i < half; i++) {
                sum1 = sum1 + array[i];
                first[i] = array[i];

            }
            for (int i = half; i < array.length; i++) {
                sum2 = sum2 + array[i];
                second[i - half] = array[i];


            }
            double ArithmeticMean1 = sum1 / half;
            double ArithmeticMean2 = sum2 / half;


            System.out.println(ArithmeticMean1);
            System.out.println(ArithmeticMean2);

            if (ArithmeticMean1 > ArithmeticMean2) {
                System.out.println("Arithmetic mean of first half is bigger " + ArithmeticMean1);
            } else if (ArithmeticMean1 < ArithmeticMean2) {
                System.out.println("Arithmetic mean of second half is bigger " + ArithmeticMean2);
            } else {
                System.out.println("Both half are equal");
            }
        }
    }
}