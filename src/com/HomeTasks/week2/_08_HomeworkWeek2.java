package com.HomeTasks.week2;

import utils.ArrayUtils;

/**
 * Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class _08_HomeworkWeek2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int random = 0;
        for (int cubicle = 0; cubicle < array.length; cubicle++) {
            random = (int) (Math.random() * 10);
            if ( cubicle % 2 ==0){
                if (random % 2 == 0) {
                    array[cubicle] = random;
                } else if (random % 2 != 0) {
                    array[cubicle] = random +1;
                }
            }else {
                if (random %2 !=0){
                    array[cubicle] = random;
                }else{
                    array[cubicle] = random +1;
                }
            }
        }

            ArrayUtils.printArray(array);
        }
    }

