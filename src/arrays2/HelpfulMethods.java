package arrays2;

public class HelpfulMethods {
    public String reverseStr(String str){
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        // Create an Object
        HelpfulMethods abc = new HelpfulMethods();

        System.out.println(abc.reverseStr("Java"));
        int [] nums={5,6,2,0,2,7};
        System.out.println(abc.getAverage(nums));

    }

    public int getAverage(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total+=num;
        }
        int average = total/nums.length;
        return average;
    }
}


