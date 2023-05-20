package classWork;

import java.util.Arrays;

public class Intersection {

    public static int[] common(int[] arr1, int[] arr2) {

        /*
        int [] arr1 = {3,12,6,-5,2}
        int [] arr2 = {12,2,8,3,-10}
         */

        int size = 0;

        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr2.length; b++) {
                if (arr1[a] == arr2[b]) {
                    size++;
                    break;

                }
            }
        }
        int [] common = new int[size];


        int index = 0;
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr2.length; b++) {
                if (arr1[a] == arr2[b]) {
                    common[index] = arr1[a];
                    index++;
                    break;
                }
            }
        }
        return common;
    }

    public static void main(String[] args) {
        int [] arr1 = {3,12,6,-5,2};
        int [] arr2 = {12,2,8,3,-10};
        System.out.println(Arrays.toString(common(arr1,arr2)));
    }
}
