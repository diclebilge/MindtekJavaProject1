package projectDay;

import java.util.Arrays;

public class ThreeAmigos {
    /**
     * Write a method implementation that accepts
     * an array of integers as parameter and
     * returns a boolean.
     * Method should return true if array contains three consecutive even number
     * or three consecutive odd numbers otherwise return false.
     * <p>
     * Example:
     * .threeAmigos([2, 1, 3, 5]) -> returns true
     * .threeAmigos([2, 1, 2, 5]) -> returns false
     * .threeAmigos([2, 4, 2, 5]) -> returns true
     */
    public static void main(String[] args) {
        int[] nums = new int[]{10, 2, 30, 45, 66, 22, 5, 9, 7, 8,};

        //System.out.println(threeAmigos(nums));
        if (threeAmigos3(nums) != null) {
            System.out.println(Arrays.toString(threeAmigos3(nums)));

        } else {
            System.out.println("No three cons odd or even elements ");

        }

    }

    // adding "static" keyboard just to be able to call this method from the main method
    public static boolean threeAmigos(int[] arr) {
        boolean contains = false;
        for (int i = 2; i < arr.length; i++) {
            int el1 = arr[i];
            int el2 = arr[i - 1];
            int el3 = arr[i - 2];

            //check if 3 elements are all even or all odd
            if (el1 % 2 == 0 && el2 % 2 == 0 && el3 % 2 == 0) return true;
            if (el1 % 2 == 1 && el2 % 2 == 1 && el3 % 2 == 0) return true;
        }
        return false;
    }

    public static int[] threeAmigos2(int[] arr) {
        boolean contains = false;
        for (int i = 2; i < arr.length; i++) {
            int el1 = arr[i];
            int el2 = arr[i - 1];
            int el3 = arr[i - 2];

            //check if 3 elements are all even or all odd
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 == 0 && arr[i - 2] % 2 == 0) || (arr[i] % 2 == 1 && arr[i - 1] % 2 == 1 && arr[i - 2] % 2 == 1)) {
                return new int[]{i, i - 1, i - 2};
            }
        }
        return null;

    }

    //
    public static int[] threeAmigos3(int[] arr) {
        boolean contains = false;
        for (int i = 2; i < arr.length; i++) {
            int el1 = arr[i];
            int el2 = arr[i - 1];
            int el3 = arr[i - 2];

            //check if 3 elements are all even or all odd
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 == 0 && arr[i - 2] % 2 == 0) || (arr[i] % 2 == 1 && arr[i - 1] % 2 == 1 && arr[i - 2] % 2 == 1)) {
                return new int[]{arr[i], arr[i-1], arr[i - 2]};
            }
        }
        return null;

    }
}
