package strings;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StringTask9 {
    public static void main(String[] args) {
        //ask a user any word
        //if word contains any vowel letters then print  "You  word contains vowels", else "No vowels in your word"
        // a,e,i,o,u A,O,I,E,U
        //ex: laptop -> "You word contains vowels"
        //ex2: kybrd: -> "No vowels in your word"
        //ex3: SUN -> 'You word contains vowels
        //ex4: sun -> 'You word contains vowels

        Scanner input = new Scanner(System.in);
        System.out.println("Type any word?");
        String word = input.next();

        //toLowerCase()
        word = word.toLowerCase();

        boolean containsVowels = word.contains("a") || word.contains("e")|| word.contains("i")||word.contains("o")||word.contains("u");


        if (containsVowels){
            System.out.println("You  word contains vowels");

        }else {
            System.out.println("No vowels in your word");

        }


    }
}
