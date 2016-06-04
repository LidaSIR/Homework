package com.HomeTasks.week2;

import utils.ArrayUtils;

/**
 * Поменять местами наибольший и наименьший элементы в массиве
 */
public class _03_HomeworkWeek2 {
    public static void main(String[] args) {

        int[] randomNum = ArrayUtils.createAndFillRandomArray(10, 0, 101);

        ArrayUtils.printArray(randomNum);
        System.out.println();

        int max = randomNum[0];
        int min = randomNum[0];

        for (int i = 0; i < randomNum.length; i++) {
            if (min > randomNum[i]) min = randomNum[i];
            if (max < randomNum[i]) max = randomNum[i];
        }

        for (int i = 0; i < randomNum.length; i++) {
            if (randomNum[i] == max) {
                 randomNum[i] = min;
            } else if (randomNum[i] == min) {
                 randomNum[i] = max;
            }
        }
        ArrayUtils.printArray(randomNum);
    }
}

