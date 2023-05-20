package loops;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        // ask user num1, num2
        // print all even numbers between num1 and num2 (inclusive)
        // 5-11 -> 7,9,11
        // 6 - 14 -> 7,9,11,13
        // 30 - 20 ->

        Scanner input = new Scanner(System.in);
        System.out.println("Num1");
        int num1 = input.nextInt();
        System.out.println("Num2:");
        int num2 = input.nextInt();

        // if num1 is odd number than just increase by 1
        if (num1 % 2 == 1) num1 = num1 + 1;

        while (num1 <= num2) {
            System.out.println(num1);
            num1 = num1 +2;


        }
    }
}

