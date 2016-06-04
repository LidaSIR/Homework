package com.HomeTasks.week1;
/*
 Написать программу, которая при вводе числа в диапазоне от 1 до 99
 добавляет к нему слово "копейка" в правильной форме. Например, 1 копейка, 5 копеек, 42 копейки .
 */

import java.util.Scanner;

/**
 * Created by Lida on 27.05.2016.
 */
public class _11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in the interval from 1 to 99");

        int num = sc.nextInt();
        // 1 - A
        int end = num % 10;

        if (num >= 10 && num <= 20) {  // краще в один рядок?
            System.out.println(num + "копееек");
        } else if (end == 1 && !(num == 11)) {
            System.out.println(num + "копейка");
        } else if (end == 2 | end == 3 | end == 4) {
            System.out.println(num + "копейки");
        } else if (end == 5 | end == 6 | end == 7 | end == 8 | end == 9) {
            System.out.println(num + "копееек");

        }
    }
}