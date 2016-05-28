package com.HomeTasks.week1;

/*
        22 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
        23 тавляется, если сумма покупки превышает 1000 гривен.
        */
/**
 * Created by Lida on 27.05.2016.
 */

/*8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
         тавляется, если сумма покупки превышает 1000 гривен.*/

public class _08 {
    public static void main(String[] args) {
        int price = 1900;
        int discount = 10;

        boolean bool = price > 1000;
         if(bool == true){
             int discountRes = (price * discount)/100;
             System.out.println( "Your price is " + discountRes);
         } else {
             System.out.println("You don't have a discount, so you price is "+ price);
         }


    }
}
