package strings;

import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {
        //as a user to enter a word.
        //ask a user 'Which char you want to print?"(type number), save in int
        //print that char
        //ex:"Mindtek"   1 => M,  2=>i  3=> n
        //charAt(index);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input. next();
        System.out.println("Which char you want to printed? (enter a number)");
        int num = input.nextInt();
        int index = num-1;
        System.out.println(word.charAt(index));





    }
}
