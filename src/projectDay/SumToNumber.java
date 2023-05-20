package projectDay;

import java.util.Arrays;

public class SumToNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{40, 88, 23, 60, 43};
        //                   i  0   1   2   3   4
        System.out.println(Arrays.toString(nums));

        System.out.println(make100With3(nums));
    }

    public static boolean make100With2(int[] nums){
        // logic to find if x+y=100 in nums
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 100 ) return  true;
            }
        }

            return false;
        }
    public static boolean make100With3(int[] nums){
        // logic to find if x+y=100 in nums
        for (int i = 0; i < nums.length; i++) {
            int a = 100 - nums [i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == a ) return  true;
            }
        }
        return false;
    }
}





