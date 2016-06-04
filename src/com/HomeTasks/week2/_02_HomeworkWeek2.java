package com.HomeTasks.week2;

import com.sun.org.apache.xpath.internal.SourceTree;
import utils.ArrayUtils;

/**
 * Created by Lida on 03.06.2016.
 */
// Найти среднее арифметическое массива

public class _02_HomeworkWeek2 {
    public static void main(String[] args) {

        int[] randomNum = ArrayUtils.createAndFillRandomArray(10, 10, 101);
        int arraySum = 0;

        for (int i = 0; i < randomNum.length; i++) {
            arraySum = arraySum + randomNum[i];
        }
        int ArithmeticMean = arraySum / randomNum.length;
        System.out.println("Arithmetic mean of array is " + ArithmeticMean);
    }
}
