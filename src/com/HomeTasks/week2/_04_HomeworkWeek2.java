package com.HomeTasks.week2;

import utils.ArrayUtils;

/**
 * Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class _04_HomeworkWeek2 {
    public static void main(String[] args) {

        int[] firstArray = ArrayUtils.createAndFillRandomArray(10,0,101);
        int[] secondArray = ArrayUtils.createAndFillRandomArray(10,0,101);

        ArrayUtils.printArray( firstArray);
        System.out.println();
        ArrayUtils.printArray(secondArray);
        System.out.println();


        for (int i = 0; i <firstArray.length ; i++) {
            secondArray[i] = firstArray[i];
            
        }
        ArrayUtils.printArray( secondArray);
    }
}
