package com.HomeTasks.week1;

import java.util.Scanner;

/**
 * Created by Lida on 26.05.2016.
 */

//2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрицательные заменить на 0.

public class _02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Please, type a number:");
        double a = sc.nextInt();
        System.out.println( "Please, type a number:");
        double b = sc.nextInt();
        System.out.println( "Please, type a number:");
        double c = sc.nextInt();

        if(a >= 0){
            a =  Math.pow(a, 3);
        }else {
            a = 0;
        }
        if(b >= 0){
             b =  Math.pow(b, 3);
        }else {
            b = 0;
        }
        if(c >= 0){
             c =  Math.pow(c, 3);
        }else {
            c = 0;
        }

        System.out.println("Number 1 is " + a + "   Number 2 is "+ b + "   Number 3 is "+ c);
    }
}
