package loops;

import java.util.Scanner;

public class PrintNameXTimes {
    public static void main(String[] args) {
        // ask a user their name
        // how many times the game should be printed x
        // Mike 4 Mike Mike Mike Mike
        // Mike - 8

        Scanner input = new Scanner(System.in);
        System.out.println("Your name");
        String name = input.next();

        System.out.println("How many time the name should be printed");
        int amount = input.nextInt();

        // print name amount times:
        while (amount > 0) {
            System.out.println(name);
            amount = amount -1; // amount --;
        }
    }
}
