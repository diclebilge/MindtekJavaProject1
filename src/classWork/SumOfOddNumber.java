package classWork;

import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num1 = input.nextInt();
        int sum = 0;

        while(num1>0) {
            if (num1 %2==1) {
                sum = sum + num1;
            }
            num1--;
        }
            System.out.println("Sum of odd numbers is " + sum);






    }
}
