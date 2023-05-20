package projectDay;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class taskDCoins {
    public static void main(String[] args) {
        // Quarters, Dimes, Nickels, Penny, and Total in dollars
        //[2]         [4]      [3]     [2]
        int[] coins= new int[]{5, 1, 10, 5, 25, 1, 5, 10, 10, 10, 25};

        int quarters=0;
        int dimes=0;
        int nickels=0;
        int penny=0;
        int sum = 0;
        int total=0;

        for(int i=0; i<coins.length; i++){
            if(coins[i]==5) {
                nickels++;

            }else if (coins[i]==25) {
                quarters++;
            } else if (coins[i]==10){
                dimes++;

            }else if(coins[i]==1){
                penny++;

            }

        }
        System.out.println("Quarter: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Penny:" + penny);







    }




}
