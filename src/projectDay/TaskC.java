package projectDay;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();

        System.out.println("Number of char's index ");
        char letter = input.next().charAt(0);

        int wordLength = word.length() - 1;

        int count = 0;
        int index = 0;


        while (index <= wordLength) {
            if (word.charAt(index) == letter) {

                count++;

            }
            index++;
        }
        System.out.println("The number of " +  letter  + " is " + count);
    }
}