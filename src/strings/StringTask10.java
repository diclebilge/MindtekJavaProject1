package strings;

import com.sun.tools.attach.AgentInitializationException;

import java.util.Scanner;

public class StringTask10 {
    public static void main(String[] args) {

        // swimming club. Member must have an age of 5 to 10. The gender must be female.
        // ask a user their age. Then ask  user their gender.
        // if age is between 5 an 10 inclusive AND if gender is female then print " Welcome to the club"
        //else print " Sorry you did not qualify..."

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age");
        int age = input.nextInt();

        System.out.println("Your gender?");
        String gender= input.next();

        boolean ageIsAccepted = age>5 && age<=10;
        boolean genderIsAccepted = gender.toLowerCase().equals("female");


        if (ageIsAccepted &&  genderIsAccepted) {
            System.out.println("Welcome to the club");
        }else{
            System.out.println("Sorry you did not qualify...");

            //Ex:age 7, gender male -> Sorry you did not qualify  because this is club for girls
            //Ex: age 4 , gender female -> Sorry you did not qualify  because of your age
            //Ex: age 11 , gender male -> Sorry you did not qualify  because this is club for girls and because of your age



        }


    }
}
