package strings;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class StringTask7 {
    public static void main(String[] args) {
        String word = "table";
        System.out.println(word.indexOf('a'));

        //ask a user to enter a word
        //ask a user which char's they want to be printed
        //Ex: keyboard  y-> the location of y is number #3
        //Ex: keyboard  b-> the location of y is number #4
        //Ex: keyboard  s-> the location of y is number #9
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word");
        String wor = input.next();
        System.out.println("Which char's location you want to be printed:");
        String desired_char = input.next();

        System.out.println("The location of ");






    }
}
