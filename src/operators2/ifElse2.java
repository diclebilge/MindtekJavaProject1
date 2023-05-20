package operators2;

import java.awt.*;
import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        // ask a user any number
        //save that number in int variables
        //print "The given number is positive" if number is positive x>0
        // print "The given number is negative" if number is negative x<0
        //if{}{}

        Scanner input = new Scanner(System.in);
        System.out.println("Type an int number");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("The given number is positive");
        }
        if (num < 0) {
            System.out.println("The given number is negative.");
        }
        if (num==0){
            System.out.println("The given number is zero");
        }

            System.out.println("The end");
        }
    }

