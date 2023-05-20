package wrappers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int [] arr1 = new int []{1,2,3,4,5};
        int [] arr2 = new  int [] {7,8,9};

        System.out.println(contains(arr1,6));
        System.out.println(isEmpty(arr2));
        System.out.println(get(arr1, 2));
        System.out.println(Arrays.toString(arr1));
        set(arr1, 2,45);
        set(arr1, 3,55);
        System.out.println(Arrays.toString(arr1));

    }

    // method checks if int a exists in a given array, return true/false
    private static boolean contains (int [] arr, int a){
        for(int el: arr) if (el ==a) return true;

        return false;
    }
    // method checks if a given array has no elements
    private static boolean isEmpty(int[] arr){
        return arr.length==0;

    }
    // method to get an integer from a given index
    private static int get(int[] arr, int index){
        return arr[index];

    }
    // method to set given value to a given index
    private static void set(int[] arr, int index, int newValue){
        arr[index] = newValue;

    }

}
