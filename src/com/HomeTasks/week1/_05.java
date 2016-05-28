package com.HomeTasks.week1;

/**
 * Created by Lida on 27.05.2016.
 */
/*
        5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
        пара равных
        */

public class _05 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int num3 = 8;

        int sum1 = num1 + num2;

        System.out.println( sum1);

        int sum2 = num2 + num3;

        System.out.println( sum2);

        int sum3 = num1 + num3;

        System.out.println( sum3);

        boolean res1 = sum1 == sum2;
        boolean res2 = sum1 == sum3;
        boolean res3 = sum2 == sum3;


        if (res1|res2|res3) {
            System.out.println("Yes, there is at least one equal pair of numbers");
       } else {
            System.out.println("No, there is no equal pair of numbers");
        }


    }
}
