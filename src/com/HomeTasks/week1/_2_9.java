package com.HomeTasks.week1;

import java.util.Scanner;

/**
 * Created by Lida on 28.05.2016.
 */
// Посчитать сколько раз встречается символ 5 в заданном числе, которое вводит юзер (число трехкратное)
public class _2_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter three digit number ");

        int num = sc.nextInt();

        int a = num % 10;
        int b = (num / 10) % 10;
        int c = num / 100;
        int counter = 0;

        if(a == 5){
            counter ++;
        }
        if (b == 5){
            counter++;
        }
        if (c == 5){
            counter++;
        }
        System.out.println(counter);


    }
}
