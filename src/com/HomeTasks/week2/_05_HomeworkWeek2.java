package com.HomeTasks.week2;

import utils.ArrayUtils;

import java.util.Scanner;

/**
 * Посчитать сколько раз цифра(цифра задается пользователем) встречается в  случайно сгенерированом массиве
 */
public class _05_HomeworkWeek2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter some number from 0 to 100");
        int number = sc.nextInt();
        int[] array = ArrayUtils.createAndFillRandomArray(10,0,101);
        int counter = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == number){
                counter = counter +1;
            }
        }
        ArrayUtils.printArray(array);
        System.out.println();
        System.out.println(counter);
    }
}
