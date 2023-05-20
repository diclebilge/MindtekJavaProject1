package Conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Coffee or Tea?");
        String drinkType = input.next().toLowerCase();
        System.out.println("Which size? small or medium or large");
        String size = input.next().toLowerCase();
        double smallPrice = 1.5;
        double mediumPrice = 2;
        double largePrice = 2.5;
        double blackCoffeePrice = 0.5;
        double lattePrice = 1;
        double blackTeaPrice = 1;
        double greenTeaPrice = 1.5;
        double total = 0;


        // Coffee, medium -> Your order is medium coffee.
        //coffee typeof a drink + size of a drink

        // if (coffee) {} else if{ {tea}  {   } else  {"We do not have that.. }
        if (drinkType.equals("coffee")) {
            System.out.println("Black or Latte");
            String coffeeType = input.next();
            System.out.println("Your order is a " + " " + size + " " + coffeeType + " " + drinkType);


            //if (size is medium)total  = total + medium price;
            //if (coffeeType is black coffee) total = total + blackCoffee

            if (size.equals("small")) {
                total = total + smallPrice;
            } else if (size.equals("medium")) {
                total = total + mediumPrice;
            } else {
                total = total + largePrice;
            }

        }

    }

}





