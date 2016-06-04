package week2;

import java.util.Scanner;

/**
 * Created by Lida on 29.05.2016.
 */
// Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
public class _2_2_HomeTask_week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");

        int num1 = sc.nextInt();

        System.out.println("Enter first number:");

        int num2 = sc.nextInt();

        System.out.println("Enter first number:");

        int num3 = sc.nextInt();

        if (num1 >= num2 & num1 >= num3)  {
            System.out.println(num1);
        }
        if (num2 >= num1 & num2 >= num3)  {
            System.out.println(num2);
        }
        if (num3 >= num1 & num3 >= num2)  {
            System.out.println(num3);
        }
        if (num1 <= num2 & num1 <= num3) {
            System.out.println(num1);
        }
        if (num2 <=  num1 & num2 <=num3) {
            System.out.println(num2);
        }
        if (num3 < num2 & num3 < num1) {
            System.out.println(num3);


        }

    }
}