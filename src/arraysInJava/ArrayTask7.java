package arraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask7 {
    public static void main(String[] args) {
        // ask a user how many numbers they want to store: 5
        // one by one as a user to type x numbers save all numbers in your array
        // print array with Arrays.toString() method

        // how many numbers: 4
        // create an array with length of 4 [ 0, 0 , 0, 0]
        // Type number : 34 [34,0,0,0]
        // Type number : 44 [44,0,0,0]


        Scanner input = new Scanner(System.in);
        System.out.println("How many number they want enter:");
        int length = input.nextInt();
        int [] arr = new int[length];
        System.out.println(Arrays.toString(arr));

        int num = 10;

        for (int i = 0; i<arr.length; i++) {
            System.out.println("Type your number" + (i + 1));
            num = input.nextInt();
            arr[i] = num;
        }
            System.out.println(Arrays.toString(arr));
        }



    }

