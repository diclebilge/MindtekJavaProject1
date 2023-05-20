package loops;

import java.util.Scanner;

public class FizzBuzzLoop {
    public static void main(String[] args) {
        // ask a user a positive number
        // start from 1 up to givenNumber  -> 8
        // 1
        // 2
        // 3 Fizz
        // 4
        // 5 Buzz
        // 6 Fizz
        // 7
        // 8
        // 15 FizzBuzz

        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive number:");
        int num = input.nextInt();
        int startingNum = 1;
        while(startingNum <=num){

           if (startingNum%15==0) {
               System.out.println(startingNum + "FizzBuzz");
               startingNum++;


           }else if(startingNum%5 == 0) {
               System.out.println(startingNum + "Buzz");
               startingNum++;


           }else if (startingNum%3==0) {
               System.out.println(startingNum + "Fizz");


           } else{
               System.out.println(startingNum);
           }
           startingNum++;
        }

        }


        }
