package sundayClass;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        // Ask a user to input  two int values, a and b, print out  true if either one is 6.
        // Or if their sum is 6 or difference is 6.

        // num1 = 6 --- true
        //or
        // num2 = 6 --- true
        //or
        //num1+num2 = 6 --- true
        // or
        //num1 - num2 --- true


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number  a num1 and num2");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1==6 || num1 - num2 == 6 || num1+num2 ==6) {
            System.out.println("True");

        }else{
            System.out.println("False");
        }



    }
}
