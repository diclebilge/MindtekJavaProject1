package loops;

import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        // factorial 5 : res= 5*4*3*2*1           print res
        // factorial 3 : res= 3*2*1               print res
        // factorial 7 : res = 7*6*5*4*3*2*1      print res
        // ask a user for a positive number,      print the factorial value of that number

        Scanner input = new Scanner(System.in);
        System.out.println("Positive number: ");
        int givenNum = input.nextInt();
        int result = 1;

        while(givenNum>0) {
            result = result * givenNum;
            givenNum--;

        }

            System.out.println("Factorial: " + result);

        }





    }
