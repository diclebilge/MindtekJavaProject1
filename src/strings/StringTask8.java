package strings;

import java.util.Locale;
import java.util.Scanner;

public class StringTask8 {
    public static void main(String[] args) {
        // ask a user fName, lName -> fName. Lname@gmail.com
        //they might enter uppercase letters, make sure your is all lowercase
        //ex: fName: Guli lName:Smith  guli.smith@gmail.com
        // "You new email is :  fName.Lname@gmail.com"

        Scanner input = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName = input.next();
        System.out.println("Last Name:");
        String lName = input.next();

        String email = fName +"." + lName + "gmail.com";
        System.out.println("Your new email is: "  + email);






    }
}

