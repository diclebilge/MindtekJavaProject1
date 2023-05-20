package operators3;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class PasswordFinder {
    public static void main(String[] args) {
        int password = 2589;

        // ask a user to input 4 digit int password
        // if entered password matches password the print "Access granted, the door is opening"
        // if does not match then print "ask a user to input 4 digit int password"

        Scanner input = new Scanner(System.in);
        System.out.println("Type your password?");
        int givenPassword = input.nextInt();

        if (givenPassword == password) {
            System.out.println("Access granted' the door is open.");
        }

            else{
                System.out.println("ask a user to input 4 digit int password");
            }

        }


    }
