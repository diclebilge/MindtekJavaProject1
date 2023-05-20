package ownPractice;

public class practice1 {
    public static void main(String[] args) {
        // From --> 1
        // To --> 20
        // What is the number from 1 to 20 sum?

        int sum = 0;
        int i = 0;

        while (i<=20) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum: " + sum);


    }
}
