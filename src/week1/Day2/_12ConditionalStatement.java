package week1.Day2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Lida on 26.05.2016.
 */
public class _12ConditionalStatement {
    public static void main(String[] args) {
        String name = "Ann";
        int pass = 123456;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your password" + sc );
        int enteredPassword = sc.nextInt();
        if( enteredPassword == pass){
            System.out.println("Entered successful ");

        } else {
            System.out.println("Go home");


        }


    }
}
