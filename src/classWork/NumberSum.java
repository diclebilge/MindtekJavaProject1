package classWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("Please enter sum of numbers");
        int num4 = input.nextInt();

        if (num1 + num2 + num3 == num4) {
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");


       }

    }
}
