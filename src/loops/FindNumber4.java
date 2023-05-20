package loops;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class FindNumber4 {
    public static void main(String[] args) {
        int numberInCpu = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("I have a number in my cpu, try to guess it.You have only 3 chances...");
        int givenNumber = input.nextInt();
        int count = 1;

        while (givenNumber != numberInCpu && count < 3) ;


        if (givenNumber > numberInCpu) {
            System.out.println("Incorrect, try lower...");
        } else if (givenNumber < numberInCpu) {
            System.out.println("Incorrect, try higher...");
        }
        givenNumber = input.nextInt();
        count++;

        if (count > 3) {
            System.out.println("You lost! You hav used all 4 chances...");
        } else {
            System.out.println("Incorrect, try higher");
        }

        System.out.println("Congrats you found it look" + count +"tries");
    }
}



