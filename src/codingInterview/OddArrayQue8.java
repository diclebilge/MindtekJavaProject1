package codingInterview;

public class OddArrayQue8 {
    public static void main(String[] args) {

        //Write a code that will print only odd number from array. int[] nums={5,3,8,1,9};

        int[] nums = {5, 3, 8, 1, 9,};

        for (int num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

    }
}
