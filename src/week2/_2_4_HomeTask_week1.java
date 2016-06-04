package week2;

import java.util.Scanner;

/**
 * Created by Lida on 29.05.2016.
 */

// Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
public class _2_4_HomeTask_week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some number with floating point");

        double num = sc.nextDouble();

        if(num >= 0 && num <= 1){
            System.out.println("Yes, this number is in a span from 0 to 1");
        }else{
            System.out.println("No, this number is  not in a span from 0 to 1");
        }
    }
}
