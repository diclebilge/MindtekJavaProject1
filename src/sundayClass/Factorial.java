package sundayClass;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int count = 5;
        int result = 1;

        //. Create a class with main method and Scanner
        // Write a code that will ask from user to enter number and then it will print factorial number.
        //Example:
        //Enter number:5
        //Factorial number for 5 is 12
        // Factorial number is a multiplication of numbers between 1 and number.
        //For example to find factorial number of 5 we should multiply numbers starting from 1 (1*2*3*4*5=120). Factorial number of 3 is 6 (1*2*3=6).


        while (num > 0) {

            result = result * num;


        }
    }
}