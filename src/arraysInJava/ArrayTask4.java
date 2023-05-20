package arraysInJava;

import java.util.Arrays;

public class ArrayTask4 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 23, 11, 45, 566, -2000, -23, 45};


        //print the min number from the given array
        int min = arr[0];
        System.out.println(Arrays.toString(arr));

        //for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

            System.out.println("The min: " + min);


        }
    }

