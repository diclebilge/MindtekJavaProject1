package arraysInJava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class ArrayTask8 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 23, 34, 56, 67};
        // add 3 into each value of arr, then print it
        // {15,26, 37, 48, 59, 70, 81}

        int  newarr [] = new int[arr.length];
        for (int i= 0; i<arr.length;i++){
            newarr[i]  =arr[i]+3;
            System.out.println(Arrays.toString(newarr));
        }

//        Scanner input = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] + 3;
//
//            System.out.println(Arrays.toString((arr)));
//            int[] arr2 =new int[arr.length];
//
//            for (int i = 0; i< arr.length i++){
//                arr2[i]= arr{1]
//
//            for (int element : arr) {
//                System.out.println(element);
//
//            }
//
//
//
//
//                System.out.println(Arrays.toString(arr[i]));
//
//
//            }
//        }
//    }
    }
}