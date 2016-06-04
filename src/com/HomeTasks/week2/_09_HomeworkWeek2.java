package com.HomeTasks.week2;

import utils.ArrayUtils;

/**
 * Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 */
public class _09_HomeworkWeek2 {
    public static void main(String[] args) {
        int[] array1 = ArrayUtils.createAndFillRandomArray(10, 25, 76);
        int[] array2 = ArrayUtils.createAndFillRandomArray(10, 25, 76);
        ArrayUtils.printArray(array1);
        System.out.println();
        ArrayUtils.printArray(array2);
        System.out.println();
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < array1.length; i++) {
            int evenNum = array1[i] % 2;
            if (evenNum == 0) {
                counter1 = counter1 + 1;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            int evenNum = array2[i] % 2;
            if (evenNum == 0) {
                counter2 = counter2 + 1;
            }
        }
        if(counter1 > counter2){
            System.out.println("There are more even numbers in the first array");
        }else {
            System.out.println("There are more even numbers in the second array");
        }
    }
}
