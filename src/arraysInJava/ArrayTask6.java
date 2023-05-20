package arraysInJava;

import java.util.Arrays;

public class ArrayTask6 {
    public static void main(String[] args) {

        int[] arr = new int[]{12, 23,  5, 566, 600};
        boolean isIncreasing = true;
        System.out.println(Arrays.toString(arr));
        // {12, 23, -10000, 45, 566, -2000, -23, 45} -> is not increasing order
        // {12, 23, 34, 45, 566,2000 }; is in increasing order
        //  0    1   2   3   4   5
        // {12, 23, 34, 45, 566, 2}; is not increasing order
        // print "it is in increasing order"
        // or print "It is not in increasing order."
        // i = i-1

        for (int i = 1; i <arr.length; i++){ // (i: 1  oldugunda)
            if(arr[i] < arr[i-1]) {  // (arr is 23)
                System.out.println("Is not in increasing order.");
                break;

                }
            }
        if (isIncreasing)  System.out.println("Is in increasing order...");
        }











    }
