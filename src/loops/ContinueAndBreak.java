package loops;

import java.util.Scanner;

public class ContinueAndBreak {
    public static void main(String[] args) {
        // break: escape from loop
        // continue: jump to the next iteration

        Scanner input = new Scanner(System.in);
        System.out.println("From");
        int num1 = input.nextInt();
        System.out.println("To");
        int num2 = input.nextInt();

        //30 37 -> 30, 32, 34, 36
        //31 37 -> 32,34,36

        while (num1 <= num2) {
            System.out.println("Beginning of a while loop...");
            if(num1%2==1){
                num1++;
                System.out.println("Hi from first if condition!");
             continue; // jump to the next iteration
            }
            if (num1%2==0) {
                System.out.println("Hi from second if condition!");
                System.out.println(num1);
            }
            num1++;
            System.out.println("The end of while loop...");


        }
    }
}
