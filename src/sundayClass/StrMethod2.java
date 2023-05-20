package sundayClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StrMethod2 {
    public static void main(String[] args) {
        //Ask a user to input a word.
        //Print out a new string made of 3 copies of the first 2 chars of the original string.
        //The string may be any length.
        // If there are fewer than 2 chars, use whatever is there.
        //Example:
        //"Hello"  → "HeHeHe"
        // "ab"     → "ababab"
        // "H"      → "HHH"

        Scanner input = new Scanner(System.in);
        System.out.println("Input a word");
        String word = input.next();

        if (word.length() >= 2) ;

        System.out.println(word.substring(0, 2) . repeat(3));

    }







    }

