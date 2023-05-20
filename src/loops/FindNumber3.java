package loops;

import java.util.Scanner;

public class FindNumber3 {
    public static void main(String[] args) {
        int numberInCpu = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("I have a number in my cpu, try to guess it...");
        int givenNumber = input.nextInt();
        int count = 1;

        while (givenNumber != numberInCpu);


        if (givenNumber > numberInCpu) {
            System.out.println("Incorrect, try lower...");
        }else if (givenNumber <numberInCpu) {
            System.out.println("Incorrect, try higher...");

            givenNumber = input.nextInt();
            count++;

        }

        System.out.println("Congrats you find it! It took" + count +"tries.");
    }
}
