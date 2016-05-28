package week1.Day2;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

/**
 * Created by Lida on 25.05.2016.
 */
public class _06RelationalAndLogicalOperations {
    public static void main (String[] args ){
        int a = 4;
        int b = 10;

        boolean res1 = a > b;

        int c= 18;
        int d = 1;

        boolean res2 = c !=d;
        boolean result = res1 | res2;

        System.out.println(result);

    }
}
