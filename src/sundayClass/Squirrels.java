package sundayClass;

import java.util.Scanner;

public class Squirrels {
    public static void main(String[] args) {
        //The squirrels in Palo Alto spend most of the day playing
        // Ask a user to input temperature: --- int
        // user needs to input true or false if it summer. ---- boolean
        //They play if the temperature is between 60 and 90 (inclusive). But, if it is Summer,
        // then the upper limit is 100 instead of 90.
        //Print out true if the squirrels play and false otherwise.

        Scanner input = new Scanner(System.in);
        System.out.println("Is it summer: True/false ");
        int temperature =  input.nextInt();
        boolean isSummer = input.hasNextBoolean();

        boolean squirrelsArePlaying = true;

        if ( temperature >= 60 && temperature <=100 && isSummer ){

            System.out.println("true");

        }else if (temperature >= 60 && temperature <=90) {

            System.out.println("true");
        }else{
            System.out.println("false");

        }





    }
}
