package com.HomeTasks.week1;

/**
 * Created by Lida on 27.05.2016.
 */
//У вас есть скорость и растояние, за какое время вы приедете в пукт назначания

public class _06 {
    public static void main(String[] args) {
        int speedMetrsPerSec = 20;
        int distanceInMetrs = 300;

        int time = distanceInMetrs / speedMetrsPerSec;

        System.out.println("You will reach the point in  " + time + " seconds");


    }
}
