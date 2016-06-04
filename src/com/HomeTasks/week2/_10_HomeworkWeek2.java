package com.HomeTasks.week2;

import utils.ArrayUtils;

/**
 * Created by Lida on 04.06.2016.
 */
public class _10_HomeworkWeek2 {
    public static void main(String[] args) {

        int[]array = {2,4,12,54,98,35,5,17,6,0};
        int[] splitArray = ArrayUtils.splitArray(array,5,8);

        ArrayUtils.printArray(splitArray);
    }
}
