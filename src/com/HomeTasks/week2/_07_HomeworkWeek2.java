package com.HomeTasks.week2;

import utils.ArrayUtils;

/**
 * Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 который получается в результате суммы arr1[i] + arr2[i]
 */
public class _07_HomeworkWeek2 {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtils.createAndFillRandomArray(10,0,101);
        int[] arr2 = ArrayUtils.createAndFillRandomArray(10,0,101);
        ArrayUtils.printArray(arr1);
        System.out.println();
        ArrayUtils.printArray(arr2);
        System.out.println();
        int[] arraySum = new int[10];
        for (int i = 0; i <arr1.length ; i++) {
          int sum = 0;
           sum = arr1[i] + arr2 [i];
            arraySum[i] =sum;
        }
        ArrayUtils.printArray(arraySum);
    }
}
