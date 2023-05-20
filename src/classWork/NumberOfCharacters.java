package classWork;

import java.util.Scanner;

public record NumberOfCharacters() {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");

        String word = scanner.next();
        System.out.println("Enter number of characters:");

        int numChars = scanner.nextInt();
        scanner.close();
        if (numChars > word.length()) {
            System.out.println("Word doesn't have.");
        } else {
            String substring = word.substring(0, numChars);
            System.out.println(substring);

        }
    }
}
