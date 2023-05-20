package projectDay;

import java.util.Arrays;
import java.util.Scanner;

public class taskBNumbers {
    public static void main(String[] args) {
        // asks user to enter 5 different numbers.
        //And all entered numbers should be stored in array of ints
        //and printed.Then write a logic that prints largest number
        //from that array

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 number.");
        int[] arr = new int[]{4, 2, 35, 65, 76};
        int length=5;

        int  number [] = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(number));

        }



        System.out.println("Largest number from array is: ");




    }
}
