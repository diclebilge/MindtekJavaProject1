package operators2;

import java.util.Scanner;

public class Age18 {
    public static void main(String[] args) {
        //meetup club age>18 and age<40
        // ask a user their first name, save it in a variable
        //ask a user their birth year, save it in int variable
        //calculate their age
        // if age is between 18 and 40 then print "Mike you are accepted. Welcome to the club"
        // if age <=18 print "Mike, sorry you are too young to be a member."
        // if age >=40 print "Mike, sorry it will not be interesting for you."


        Scanner input = new Scanner(System.in);
        System.out.println("Type your name:");
        String name =input.next();

        System.out.println("Type your birth year: ");
        int year = input.nextInt();
        int age = 2023 - year;

        if(age <= 18) {
            System.out.println(name + " sorry you are too young to be a member.");

        } else if (age >= 40) {
            System.out.println(name + " sorry it will not be interesting fo you.");
        }else{
            System.out.println(name + " you are accepted. Welcome to the club" );



        }
    }
}
