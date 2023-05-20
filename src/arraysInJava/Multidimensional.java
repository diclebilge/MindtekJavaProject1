package arraysInJava;

import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        int [] [] [] arr2 = new int [2] [3] [4];

        // arr = [[0,0,0,0], [0,0,0,0], [0,0,0,0]]

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i< arr.length; i++) System.out.println(Arrays.toString(arr[i]));
    }

}
