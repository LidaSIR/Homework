package week2;

import java.util.Scanner;

/**
 * Created by Lida on 29.05.2016.
 */
/*
Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
Если второе больше, то выводим сумму.
*/

public class _2_5_HomeTask_week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");

        int num1 = sc.nextInt();

        System.out.println("Enter second number");

        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 - num2);
        } else  if (num1 < num2){
            System.out.println(num1 + num2);
        }
    }
}
