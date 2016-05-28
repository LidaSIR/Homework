package com.HomeTasks.week1;

/**
 * Created by Lida on 26.05.2016.
 */

 /*
        3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
        одинаковые; б) есть ли среди его цифр одинаковые.
        */

public class _03 {
    public static void main(String[] args) {
        int number = 143;
        int num1 = 1;
        int num2 = 4;
        int num3 = 3;

        boolean res1 = num1 == num2;
        boolean res2 = num2 == num3;
        boolean res3 = num1 == num3;

        if(res1&res2&res3) {
            System.out.println( "Yes, this numbers are equal");
        } else {
            System.out.println( "No, this numbers are not equal");

            if(res1|res2 |res3){
                System.out.println( "Yes, there are equal numbers");

            } else{
                System.out.println( "No, there are no equal numbers");
            }
        }







    }
}
