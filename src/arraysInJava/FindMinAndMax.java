package arraysInJava;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
        // ask a user 5 numbers. Print the lowest and the highest value(s)

        int min = 0,  max = 0;
        int number = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        number = input.nextInt();
        min = number;
        max = number;

        System.out.println("Type a number: ");
        number = input.nextInt();
        if(number < min) {min = number;}
        if(number > max) {max = number;}

        // 3rd number:
        System.out.println("Type a number: ");
        number = input.nextInt();
        if(number < min) {min = number;}
        if(number > max) {max = number;}

        //4th number:
        System.out.println("Type a number: ");
        number = input.nextInt();
        if(number < min) {min = number;}
        if(number > max) {max = number;}

        System.out.println("The min is: "  + min);
        System.out.println("The max is: "  + max);

        //5th number:
        System.out.println("Type a number: ");
        number = input.nextInt();
        if(number < min) {min = number;}
        if(number > max) {max = number;}

        System.out.println("The min is: "  + min);
        System.out.println("The max is: "  + max);
    }
}
