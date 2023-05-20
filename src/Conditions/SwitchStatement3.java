package Conditions;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class SwitchStatement3 {
    public static void main(String[] args) {
        // fizz buzz: ask a user an int number
        // if divisible by 15 print FizzBuzz
        // if divisible by 5 print Buzz
        // if divisible by 3 print Fizz
        // else print "Not fizz buzz matching number"

        Scanner input = new Scanner(System.in);
        System.out.println("Type a number:");
        int num = input.nextInt();
        int rem1 = num %15;
        int rem2 = num%5;
        int rem3 = num%3;

       if (num%15==0) System.out.println("FizzBuzz");
        else if(num%5==0) System.out.println("Buzz");
       else if (num%3==0) System.out.println("Fizz");
        else System.out.println("Not fizz buzz matching number");

        //switch (num%15){
           // case 0:
                System.out.println("FizzBuzz");
                //break;
            //case 3:
                System.out.println("Fizz");
               //break;
            //case 5:
                 System.out.println("Buzz");
                 //break;
                // default:
                     System.out.println("Not fizz buzz matching number");
             }

        }



