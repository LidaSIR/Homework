package com.HomeTasks.week1;

/**
 * Created by Lida on 27.05.2016.
 */
/*
        4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
        ду. Какая из них больше?
        */

public class _04 {
    public static void main(String[] args) {

        int speedMetrePerSecond = 5;
         int speedKilPerHour = 120;

        if ((120/3.6)>5){
            System.out.println("Speed in kilometers per hour is higher");
        } else{
            System.out.println("Speed in metre per second is higher");
        }
    }
}
