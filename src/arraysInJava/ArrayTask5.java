package arraysInJava;

import java.util.Arrays;

public class ArrayTask5 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 23, -10000, 45, 566, -2000, -23, 45};
        //find  and print the max


        int max = arr[0];
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

            System.out.println("The max: " + max);
        }
    }


