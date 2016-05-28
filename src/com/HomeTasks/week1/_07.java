package com.HomeTasks.week1;

import java.util.Scanner;

/**
 * Created by Lida on 27.05.2016.
 */
/*Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
         времени года. Если пользователь введет недопустимое число, программа
         должна выдать сообщение об ошибке. */

public class _07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number from 1 to 12");

        int answer = sc.nextInt();

        boolean bool = 1 <= answer;
        boolean bool1 = answer <= 12;

        if (!(bool & bool1)) {
            System.out.println("Incorrect number");
        } else if (answer == 1) {
            System.out.println("January is the first month of the year and" +
                    " the warmest month of the year within most of the Southern Hemisphere" +
                    "But it isnt true for Ukraine,so stay at home and eat lefts from Olivier salad");

        } else if (answer == 2) {
            System.out.println("February.Red-hearts fever everywhere. If you are single - just eat heart-shaped candies, they are tasty anyway.");
        } else if (answer == 3) {
            System.out.println(" March. If you are man - buy flowers, if you are women - buy a vase." +
                    " You cant avoid it, just put  up with it. ");
        } else if (answer == 4) {
            System.out.println("April. Happy April's Fool Day. Don't play mean jokes to your friends, do it to your enemies:)))");
        }else if (answer == 5) {
            System.out.println("May. Happy Labor Day. Don't be a pig - clean after your party!!");
        } else if (answer == 6) {
            System.out.println("June. Finely! Summer! We've been waiting for you for 9 month! ");
        } else if (answer == 7) {
            System.out.println("It is July. It is just to hot to live in Kyiv." +
                    "Thanks God we have river here...dirty but still... ");
        } else if (answer == 8) {
            System.out.println("Thanks August for watermelons and peaches");
        } else if (answer == 9) {
            System.out.println("September. Fun is over. Let's get serious and go to school. " +
                    "Happy Independence Day, by the way");
        } else if (answer == 10) {
            System.out.println("October. Trick or treat?! What would be your Halloween costume? ");
        } else if (answer == 11) {
            System.out.println("November. It is still Fall, but can you feel it?...Winter is coming...");
        } else if(answer == 12){
            System.out.println("December. Prepare your wallet, since holidays are coming. " +
                    "You haven't bought presents yet...loser");
            }



        }
    }