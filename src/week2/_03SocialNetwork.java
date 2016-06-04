package week2;

import java.util.Scanner;

/**
 * Created by Lida on 01.06.2016.
 */
public class _03SocialNetwork {
    public static void main(String[] args) {
        String login = "Admin";
        int pass = 123456;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter your password");
            int inputPass = sc.nextInt();
            if(inputPass == 123456){
                break;
            }

        }
        System.out.println("LogIn");
    }
}
