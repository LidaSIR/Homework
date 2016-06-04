package week2;

import java.util.Scanner;

/**
 * Created by Lida on 29.05.2016.
 */
/*
Вводим два числа, если одно из них делиться на другое без остатка,то выводим true и показываем результат деления
(целую часть от деления  и остачу)
        в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
*/

public class _2_7_HomeTask_week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");

        int num1 = sc.nextInt();

        System.out.println("Enter second number");

        int num2 = sc.nextInt();

        if(num1 % num2 == 0){
            System.out.println("True  " + " integer part = " + (num1/num2) + " remainder = " + (num1 % num2) );
        } else {
            System.out.println("False  " +" integer part = " + (num1/num2) +" remainder = " + (num1 % num2) );
        }

    }
}
