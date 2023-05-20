package codingInterview;

import java.util.Arrays;

public class ArrayQue1 {
    public static void main(String[] args) {
       // Combine two arrays into one array. int nums[]={2,4,3}; int nums2[]={1,8};

        int nums[]= {2,4,3};
        int nums2[]= {1,8};
        int length = nums.length;
        int length2 = nums2.length;
        int nums3[] = new int[nums.length+ nums2.length];
        for(int i=0; i<length; i++){
            nums3[i] = nums[i];
        }
        for(int i=0; i<length2; i++){
            nums3[length+i] = nums2[i];
        }
        System.out.println(Arrays.toString(nums3));
    }
    }

