package loops;

import java.util.Scanner;

public class CalculateSum2 {
    public static void main(String[] args) {
        // ask a user a positive number
        // 5 print sum of 1+2+3+4+5 -> 15
        // 3 print sum of 1+2+3     -> 6
        // 8 print sum of 1+2+3+4+5+6+7+8 -> 36

        Scanner input = new Scanner(System.in);
        System.out.println("Type  positive number: ");
        int givenNum = input.nextInt();
        int value = 1;
        int sum = 0;
        String operation = "0";

        while (value <= givenNum) {
            // keep creating string
            System.out.println("Operation string: "+ operation);
            operation = operation + "+" + value;
            sum = sum + value;
            value++;

            System.out.println(operation + " -> " + sum);

        }
    }
}

