package projectDay;

public class Contains12 {
    public static void main(String[] args) {
        int[] nums = new int[]{12, 6, 4, 11, 2,4,1};


        System.out.println(contains12(nums));

    }

    public static boolean contains12(int[] nums) {
        // find the index of 1
        int indOf1 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                indOf1 = i;
                break;
            }
        }
        if (indOf1 == -1 || indOf1 == nums.length - 1) return false;

        for (int j = indOf1 + 1; j < nums.length; j++){
            if (nums[j] == 2) return true;
    }

        return false;
    }
}

