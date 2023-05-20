package strings;

import java.util.Scanner;

public class StringTask3 {
    public static void main(String[] args) {
        //ask a user any non empty word
        // print: The first char is: p
        // print: The last char is: g
        // Programming
        String test = "5";

        Scanner input = new Scanner(System.in);
        System.out.println("Type non empty String");
        String userString = input.next();

        System.out.println("The first char is:" + userString.charAt(0));
        int lastIndex = userString.length() -1;
        System.out.println("The last char is:" +  userString.charAt(lastIndex));


    }
}
