package sundayClass;

public class countOfLuckyNums {
    public static void main(String[] args) {

        int[] arr = {5, 6, 13, 6};
        int sum = 0;


        // count sum of ints, except number 13, because it is a very unlucky number.

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 13) {

                sum += arr[i];
            }

        }
        System.out.println("Sum of lucky nums: -----> " + sum);


        int sum2 = 0;
        System.out.println("**********");


        for (int num: arr) {

            if (num!=13){
                sum2 += num;
            }
        }
        System.out.println(sum2);
    }
}
