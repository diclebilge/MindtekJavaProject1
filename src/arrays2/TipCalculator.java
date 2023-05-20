package arrays2;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
       Enter the balance:
       100
       How would rate our service? (Great/Good/Ok/Poor/Other)
       Poor
       %25 tip will be applied
       Your total:105
       Do you split?
       Yes
       For how many people?
       5
       We are splitting your bill for &&&&& people
       Each pays: 25
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the balance: ");
        int balance = input.nextInt();

        String service;


        do {
            System.out.println("How would rate our service? (Great/Good/Ok/Poor/Other)");
            service = input.next();


            if (service.equalsIgnoreCase("Great"))
                balance = balance + balance * 25 / 100;

            else if (service.equalsIgnoreCase("Good"))
                balance = balance + balance * 20 / 100;
            else if (service.equalsIgnoreCase("Ok"))
                balance = balance + balance * 10 / 100;
            else if (service.equalsIgnoreCase("Poor"))
                balance += balance * 5 / 100;
            else if (service.equalsIgnoreCase("Other")) {
                System.out.println("Enter tip amount: ");
                int amount = input.nextInt();
                balance += amount;
            } else {
                System.out.println("Invalid entry: ");
            }
        } while (!"great/good/poor/other".contains(service.toLowerCase()));
        System.out.println("Your total: " + balance);

        System.out.println("Your total: " + balance);

        System.out.println("Do you split?");
        String split = input.next();


        if (split.equalsIgnoreCase( "No")) {

            System.out.println("Your total: " + balance);
        } else if (split.equalsIgnoreCase( "Yes")){
            System.out.println("For haw many people?");
            int people = input.nextInt();
            int eachPays = balance/people;
            String ands= " ";
            while (people>0){
                ands += "&";
                people--;
            }
            System.out.println("We are splitting your bill for " +ands+" people");
            System.out.println("Each pays: " + eachPays);


        }
    }

}







