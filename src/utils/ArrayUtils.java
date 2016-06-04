package utils;

/**
 * Created by Lida on 31.05.2016.
 */
public class ArrayUtils {
    public static int[] createAndFillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void printArray (String [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void printArray ( char [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void printArray (boolean [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public  static int [] createAndFillRandomArray (int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
        }
        return array;
    }
        public static int arrayArithmeticMean (int [] array){
        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
            arraySum = arraySum + array[i];
        }
        int ArithmeticMean = arraySum / array.length;

        return ArithmeticMean;

    }
       public static void bubbleSort (int[]array){
           for (int j = array.length; j > 0 ; j--) {
               for (int i = 0; i <j -1; i++) {

                   if (array[i] > array[i+1]){

                       int tmp = array [i+1];
                       array [i+1] = array[i];
                       array[i] = tmp;
                   }
               }
           }
           }
    public static int[] splitArray(int[] array, int start, int end) {

        int[] splitArray = new int[end - start];

        for(int i = 0; i < splitArray.length; i++) {
            splitArray[i] = array [start + i];
        }
        return splitArray;
    }

}





