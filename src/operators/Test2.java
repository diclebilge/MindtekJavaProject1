package operators;

import java.rmi.Remote;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("First number: ");
        int num1 = input.nextInt();
        System.out.println("Second number: ");
        int num2 = input.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Subtraction: " + (num1 + num2));
        System.out.println("Division:" +(num1+num2));

        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);










    }
}
