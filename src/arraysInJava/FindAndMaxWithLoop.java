package arraysInJava;

import java.util.Scanner;

public class FindAndMaxWithLoop {
    public static void main(String[] args) {
        // ask a user 10 numbers. Print the lowest and the highest value(s)

        int min = 0, max = 0, number = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        number = input.nextInt();
        min = number;
        max = number;



        for (int i = 100; i<110;  i++){
            System.out.println("Type your a number: " );
            number = input.nextInt();
            if(number < min) min=number;
            if (number > max) max = number;
        }

        System.out.println("The min: " + min);
        System.out.println("The max: " + max);
    }

}

