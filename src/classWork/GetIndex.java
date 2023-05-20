package classWork;

import java.util.Scanner;

public class GetIndex {
    public static void main(String[] args) {
        /* int[] nums={3,6,1,9};
2. Write a code that asks user to enter a number, then code prints index number of entered number in array.
(If entered number which is not in array then it should  print -1)

         */

        int [] nums = {3,6,1,9};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int index = -1;
        for (int i=0; i<nums.length; i++){
            if (nums [i] == num){
                index = i;
                break;

            }
        }

        System.out.println("Index is: " + index);
    }
}
