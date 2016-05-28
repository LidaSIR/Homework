package com.HomeTasks.week1;

import java.util.Scanner;

/**
 * Created by Lida on 27.05.2016.
 */
/*
      Написать программу вычисления стоимости переговоров, если по суббо-
       там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
       ность разговора и день недели (цифра от 1 до 7).
      */

public class _10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double price = 2;
        double discount = 20;
        double priceForWeekend = (price*discount)/100;

        System.out.println("Enter which day of the week (use numbers: Monday is 1; Tuesday is 2 and so on )");

        int day = sc.nextInt();

        System.out.println("Enter duration of the conversation ");

        double timeConversation = sc.nextDouble();

        if(day == 6) {
            double SuturdayPrice = timeConversation * priceForWeekend;
            System.out.println("Your price for conversation is " + SuturdayPrice);
        } else if(day == 7){
            double SundayPrice = timeConversation * priceForWeekend;
            System.out.println("Your price for conversation is " + SundayPrice);
        } else {
            double price1 = timeConversation * price;
            System.out.println(price1);
        }





        //System.out.println( priceForWeekend);
    }
}
