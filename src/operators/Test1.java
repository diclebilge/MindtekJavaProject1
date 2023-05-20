package operators;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?:");
        String fName = input.next();

        System.out.println("What is your age?:");
        int age = input.nextInt();

        System.out.println("Hello" + fName + "Your age is " +age);





    }

}
