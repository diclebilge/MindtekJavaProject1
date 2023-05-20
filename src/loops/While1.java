package loops;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        // ask a user to give 2 numbers:
        // "From? x    "To?" y
        // print all number between x and y if x<y
        // 40 45 -> 40, 41, 42 , 43, 45
        // 40 40 -> 40
        // 40 35 ->

        Scanner input = new Scanner(System.in);
        System.out.println("From:");
        int num1 = input.nextInt();

        System.out.println("To");
        int num2 = input.nextInt();

        while(num1<=num2){
            System.out.println(num1);
            num1++;

            System.out.println("num1: " + num1);
        }

        }
    }














