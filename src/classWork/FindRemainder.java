package classWork;

import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = input.nextInt();

        System.out.println("Enter number2: ");
        int number2 = input.nextInt();

        System.out.println("Find remainder ");
        int number3 = input.nextInt();

        if (number1 / number2 == number3) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
}
