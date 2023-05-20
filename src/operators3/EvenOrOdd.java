package operators3;

import javax.swing.*;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // ask a user an int number, save it
        // if even print "Number is even" if odd print " Number is odd
        // 66, 2, 8, 100 "Number is even"
        // if x is divisible by 2 then x is even, else x is odd
        // 66%2 => 0  0=>0 true 11%2=>1  1==0
        // 11, 13, 101,97 " Number is odd"
        // if x is divisible     by 2 then x is even, else is odd

        Scanner input = new Scanner(System.in);
        System.out.println(" What is int number it?");
        int x = input.nextInt();

        if (x % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }


    }

}
