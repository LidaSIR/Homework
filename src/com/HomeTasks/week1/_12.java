package com.HomeTasks.week1;
/*
        Написать программу, которая в зависимости от характера ветра выдает
        сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
        умеренный (2); от 11-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
        */

/**
 * Created by Lida on 27.05.2016.
 */
public class _12 {
    public static void main(String[] args) {

        int wind = 6;
        boolean breeze = wind >=1;
        boolean breeze1 = wind <=4;

        boolean highWind = wind >=5;
        boolean highWind1 = wind <=10;

        boolean storm = wind >=11;
        boolean storm1 = wind <=18;


        if (breeze & breeze1){
            System.out.println("There is gentle breeze outside.");
        }else if(highWind&highWind1){
            System.out.println("There is high wind outside.");
        }else if(storm&storm1){
            System.out.println("There is storm outside.");
        }else if (wind >=19){
            System.out.println("There is hurricane  outside.");
        }
    }
}
