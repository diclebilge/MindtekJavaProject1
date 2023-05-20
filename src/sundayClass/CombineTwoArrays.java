package sundayClass;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};

        // int [] newNums = {1,2,3,4,5,6};


        int[] newNums = new int[nums1.length + nums2.length];

        int i = 0;

        for (int digit : nums1) {

            newNums[i] = digit;

            i++;
        }

        for (int digit : nums2) {

            newNums[i] = digit;
            i++;
        }
        System.out.println(Arrays.toString(newNums));




    }
}
