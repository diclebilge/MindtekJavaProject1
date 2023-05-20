package loops;

import java.util.Scanner;

public class FindPassword {
    public static void main(String[] args) {
        String dbUserName = "admin";
        String dbUserPassword = "1234";

        // keep asking for a username and password until credentials are correct
        // ask userName, ask userPasswordGiven
        // if passwords and usernames match then print "Access granted"
        // else print "Wrong credentials"  and continue asking for userName and Password

        // Type username: admin   Type userPassword: 1234 if match print "Access granted"
        // Type username: admin   Type userPassword: 123 if match print "Wrong credentials"

        Scanner input = new Scanner(System.in);
        System.out.println("Type username");
        String userNameGiven = input.next();
        System.out.println("Type Password: ");
        String userPasswordGiven = input.next();

        boolean correctCredentials =dbUserPassword.equals(userPasswordGiven)&& dbUserPassword.equals(userPasswordGiven);

        while (correctCredentials == false){
            System.out.println("---------");
            System.out.println("Wrong Credentials");
            System.out.println("Type username: ");
            userNameGiven =input.next();
            System.out.println("Type userPassword: ");
            userPasswordGiven = input.next();

            correctCredentials = dbUserName.equals(userPasswordGiven) && dbUserPassword.equals(userPasswordGiven);

            if (correctCredentials == true) System.out.println("Access Granted!");
        }

    }
}
