package strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringTask5 {
    public static void main(String[] args) {


        String userName = "maria1232@gmail.com";
        String userPassword = "PasswordForGmail123!";

        Scanner input = new Scanner(System.in);

        //ask a user to enter their username, save it in var
        //ask for a password, save it as well
        //if username and password matches then print "You are logged in, else print "Sorry, wrong credentials."

        System.out.println("Enter your username?");
        String givenUserName = input.next();
        System.out.println("Enter your password: ");
        String givenUserPassword = input.next();

        if (userName.equals(givenUserName) && userPassword.equals(givenUserPassword)) {
            System.out.println("You are logged in.");

        }else{
            System.out.println("Wrong credentials...");

        }
    }
}
