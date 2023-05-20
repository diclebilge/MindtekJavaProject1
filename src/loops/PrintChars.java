package loops;

import java.util.Scanner;

public class PrintChars {
    public static void main(String[] args) {
        // ask a user to type any text
        // Ex: Keyboard
        // K -> d
        // e -> r
        // y -> a
        // b -> o

        Scanner input = new Scanner(System.in);
        System.out.println("Type any text");
        String text = input.next();

        int leftIndex = 0;
        int rightIndex = text.length()-1;

        while (leftIndex < rightIndex){
            System.out.println(text.charAt(leftIndex) + " -> " + text.charAt(rightIndex));

            leftIndex++;
            rightIndex--;
        }

    }
}
