package loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculateSum1 {
    public static void main(String[] args) {
        // ask a user a positive number
        // 5 print sum of 1+2+3+4+5 -> 15
        // 3 print sum of 1+2+3     -> 6
        // 8 print sum of 1+2+3+4+5+6+7+8 -> 36

        Scanner input = new Scanner(System.in);
        System.out.println("Type a  number:");
        int givenNum = input.nextInt();
        int sum =0;

        while (givenNum>0) {
            sum = sum + givenNum;
            givenNum--;

        }


            System.out.println("Sum: " + sum);

    }
}
