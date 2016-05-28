package com.HomeTasks.week1;

/**
 * Created by Lida on 27.05.2016.
 */
/*
         13) Даны три числа A,B,C. Увеличить числа в два
         раза, если A+B+C>0, в противном случае заменить
         на нули.
         */

public class _13 {
    public static void main(String[] args) {
        int num1 =   5;
        int num2 = - 4;
        int num3 = 0;

        boolean sum = (num1 + num2 + num3)> 0;

        if(sum == true) {
            int res1 = num1 *2;
            int res2 = num2 *2;
            int res3 = num3 *2;

            System.out.println( res1);
            System.out.println( res2);
            System.out.println( res3);
        } else{
            num1 = 0;
            num2 = 0;
            num3 = 0;
            System.out.println( num1);
            System.out.println( num2);
            System.out.println( num3);

        }
    }
}
