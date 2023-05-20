package codingInterview;

public class FibonacciQue5 {
    public static void main(String[] args) {
        // Write a program that will print Fibonacci numbers between 1 and 100.

        int num1 = 0, num2 = 1;
        int count = 1;
// Iterate till counter is N
        while (count <= 12) {
            // Print the number
            System.out.print(num1 + " ");
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }

    }
}
