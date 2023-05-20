package classWork;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a even number between 0 and 100");
        int x = input.nextInt();

        if (x %2 != 0 && 0 <= x && x <= 100) {

            System.out.println("Valid Number ");
        }else{
            System.out.println("Invalid Number");
        }
    }
}

