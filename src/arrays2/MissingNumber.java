package arrays2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] nums = {3, 2, 6, 1, 5, 8,9,7, 10};

        //can you find the missing number from array that contains numbers between 1 and 10

        // 1.Sort
        // 2. For loop and find missing number

        Arrays.sort(nums);

        // 1,2,3,4,5,6,7,8,9,10
        for (int i = 0; i < nums.length; i++){
            if(nums[i]!=i+1){
                System.out.println(i+1);
                break;
            }

        }
    }
}
