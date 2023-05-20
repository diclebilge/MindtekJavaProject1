package arraysInJava;

import java.util.Scanner;

public class FindMindAndMax2 {
    public static void main(String[] args) {
        // keep asking a user number and if they want to continue

        int min = 0, max = 0, number = 0 , count = 1;
        String answer = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Type number 1: ");
        number = input.nextInt();
        min = number;
        max = number;
        System.out.println("Do you want to continue? Yes/No");
        answer = input.next().toLowerCase();

        //while
        while (answer.equals("yes")){
            count = count+1;
            System.out.println("Type a number:" + count);
            number = input.nextInt();
            if (number < min)   min = number;
            if (number > max)   max = number;
            System.out.println("Do you want to continue? Yes/No");
            answer = input.next();
            if (answer.equals("no")) break;
        }

        System.out.println("The min: " + min);
        System.out.println("The max: " + max);


    }

}
