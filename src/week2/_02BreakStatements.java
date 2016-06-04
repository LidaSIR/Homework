package week2;

import utils.ArrayUtils;

/**
 * Created by Lida on 01.06.2016.
 */
public class _02BreakStatements {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillArray(16);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6) {
                break;
            }
            System.out.print(array[i] + " ");
        }
    }
}
