package strings;

import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {
        // you asked a user for a word and they entered empty string

        String word = "Apple";

        //if given word is empty then print: "Sorry you entered empty string. No characters in this word."
        //if word is not empty then print the first char and the char

        System.out.println("The length: " + word.length());

        //if (condition){  } else{}

        if (word.length()==0) {
            System.out.println("Sorry you entered empty string. No characters in this word.");

        }else{
            System.out.println("First char:" + word.charAt(0));
            System.out.println("Last char:" +word.charAt(word.length()-1));
        }


    }
}
