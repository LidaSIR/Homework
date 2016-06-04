package week2;

import java.util.Scanner;

/**
 * Created by Lida on 29.05.2016.
 */
// Пользователь вводит число. Вывести на экран его удвоенное значение,если число делится на 7 нацело.
public class _2_3_HomeTask_week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        double num = sc.nextDouble();


        if (num % 7 == 0) {

            num = num * 2;

            System.out.println(num);
        }
    }
}
