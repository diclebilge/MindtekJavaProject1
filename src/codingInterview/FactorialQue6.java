package codingInterview;

import java.util.Scanner;

public class FactorialQue6 {
    public static void main(String[] args) {
        //Write a program to find a factorial number for 5.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int result = 1;
        while (num>0) {
            result += result + num;
            num--;
        }
        System.out.println("Factorial number for " + num + " is " + result);
        }




    }

