package codingInterview;

import java.util.Arrays;

public class LargestNumQue7 {
    public static void main(String[] args) {

        //Write a code to find largest number in Array without using sort method. int[] nums={5,3,8,1,9};

        int[] arr = new int[]{5,3,8,1,9};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("The largest number is : " + max);
    }
}

