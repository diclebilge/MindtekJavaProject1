package projectDay;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        String rev = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();


        int length = word.length();

        int a = length - 1;
        while (a >= 0) {
            rev = rev + word.charAt(a);
            a--;
        }

        if (word.equals(rev))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}

