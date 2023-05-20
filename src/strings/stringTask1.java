package strings;

import java.util.Scanner;

public class stringTask1 {
    public static void main(String[] args) {
        //ask as user to type their name
        //print the last char from their name
        //Ahmet print t

        Scanner input = new Scanner(System.in);
        System.out.println("Your name: " );
        String name = input.next();
        System.out.println(name.charAt(name.length()-1));







    }
}
