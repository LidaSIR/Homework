package week2;

import com.sun.deploy.util.ArrayUtil;

/**
 * Created by Lida on 01.06.2016.
 */
public class _05WorkWithArray {
    public static void main(String[] args) {
        char [] letters =  {'a', 'b', 'c'};
        char letter = 'd';
        char newLetters [] = new char [letters.length +1];

        /*for (int i = 0; i < letters.length; i++){
            newLetters [i] = letters [i];
            NewLetters [newLetters.length -1] = letter;
        }
        */
        System.arraycopy(letters, 0, newLetters,0,letters.length);



        }
    }



