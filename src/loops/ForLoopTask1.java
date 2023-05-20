package loops;

import java.util.Scanner;

public class ForLoopTask1 {
    public static void main(String[] args) {
        // ask a user for a number: x
        // print the sum of all numbers starting from 1 to x
        // 5 -> 15
        // 6 -> 21

        Scanner input = new Scanner(System.in);
        System.out.println(" What is number?");
        int num = input.nextInt();
        int result = 0;
        for (int i = 1;  i<=num; i++){  //num:5 i:3
            result=result +1;
        }
        System.out.println(result);


    }
}
