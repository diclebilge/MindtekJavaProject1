package loops;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        int numberInCpu = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("I have a number in my cpu, try to guess it...");
        int givenNumber = input.nextInt();

        // while the given number is not equals to the numberInCPU keep asking for a new number

        while (numberInCpu != givenNumber){
            System.out.println("******");
            System.out.println("Nope, try one more time...");
            givenNumber = input.nextInt();


        }
        System.out.println("Congrats you find it!");



        }


    }

