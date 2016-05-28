package com.HomeTasks.week1;

import java.util.Scanner;

//9) Написать программу вычисления идеального веса пользователя (рост-100). Выдать рекомендации о необходимости поправиться либо похудеть.


/**
 * Created by Lida on 27.05.2016.
 */
public class _09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight:");

        int weight = sc.nextInt();

        System.out.println("Enter your hight:");

        int height = sc.nextInt();

        int perfectWeight = height - 100;
        if(perfectWeight == weight){
            System.out.println("Your weight is perfect. Congratulations!");
        } else if(perfectWeight > weight){
            System.out.println("You are too thin. Eat more donuts");
        } else if(perfectWeight < weight){
            System.out.println("You are fat. Forget where your fridge is.");
        }



        System.out.println();
    }
}