package classWork;

import java.util.Scanner;

public class methodAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter?");
        String letter = input.next();

        //toLowerCase()
        letter = letter.toLowerCase();

        boolean containsVowels = letter.contains("a") || letter.contains("e") || letter.contains("i") || letter.contains("o") || letter.contains("u");


        if (containsVowels) {
            System.out.println("It is a Vowel");

            System.out.println("Please enter  the character");
            String character = input.next();

        }
        if (containsVowels) {
            System.out.println("It is a Consonant");
        }
    }
}