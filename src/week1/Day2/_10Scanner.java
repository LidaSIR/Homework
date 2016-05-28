package week1.Day2;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.security.auth.SolarisNumericUserPrincipal;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * Created by Lida on 26.05.2016.
 */
public class _10Scanner {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name ");

        String name = sc.nextLine();

        System.out.println("Your name is " +name);

        System.out.println("Enter your age ");

        int age = sc.nextInt();

        System.out.println("Your age is " + age);

    }
}
