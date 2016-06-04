package com.HomeTasks.week2;

import utils.ArrayUtils;

/**
 * Created by Lida on 03.06.2016.
 */
//Найти минимальное и максимальное значения в массиве и вывести их на консоль

public class _01_HomeworkWeek2 {
    public static void main(String[] args) {
        int[] randomNum = ArrayUtils.createAndFillRandomArray(10, 0, 101);

        ArrayUtils.printArray(randomNum);

        int max = randomNum[0];
        int min = randomNum[0];

        for (int i = 0; i < randomNum.length - 1; i++) {
            if (max < randomNum[i]) {
                max = randomNum[i];
            }
        }
        System.out.println("\nMax " + max);

        for (int i = 0; i < randomNum.length - 1; i++) {
            if (min > randomNum[i]) {
                min = randomNum[i];
            }

        }
        System.out.println("Min " + min);
    }
}
