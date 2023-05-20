package Conditions;

import java.util.Scanner;

public class SwitchStatement2 {
    public static void main(String[] args) {
        //ask a user a day and store it in var.
        // then by using switch statement compare days and print the matching number
        // Monday =>1 ,  Friday =>5 , jsdfask => Not found

        Scanner input = new Scanner(System.in);
        System.out.println("Day?");
        String day = input.next();

        switch (day){
            case "monday":
            System.out.println(1);
            break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
             case "friday":
            System.out.println(5);
            break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Not found");

        }


    }
}
