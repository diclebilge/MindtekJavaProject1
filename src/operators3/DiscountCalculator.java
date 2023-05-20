package operators3;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        // ask a user total price,save it in a double var
        // ask discount percentage, save it double var
        // calculate new total price and print: Your total is $80.
        // total_price = 10, dis_per = 20  20 percent of 100 will be 2
        // percentage: total_price * disc_per / 100
        // total_price -x  = 8

        Scanner input = new Scanner(System.in);
        System.out.println(" Total price:");
        double price = input.nextDouble();

        System.out.println("What is discount percentage:");
        double perc = input.nextDouble();
        double new_price = price - (price*perc/100);
        System.out.println("Your total is $" + new_price);





    }
}

