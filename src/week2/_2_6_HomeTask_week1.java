package week2;

import java.util.Scanner;

/**
 * Created by Lida on 29.05.2016.
 */
// Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
public class _2_6_HomeTask_week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");

        int num1 = sc.nextInt();

        System.out.println("Enter first number");

        int num2 = sc.nextInt();

        if((num1 + num2) >= 11 && (num1 + num2) <=19 ) {
            System.out.println(num1 + num2);
        }
    }
}
