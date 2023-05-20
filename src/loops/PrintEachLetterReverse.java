package loops;

import java.util.Scanner;

public class PrintEachLetterReverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type an text:");
        String text = input.next();
        int index = text.length()-1;
        while (index>=0){
            System.out.println(text.charAt(index));
            index--;

        // "Java"
        // a
        // v
        // a
        // J
        // starting point : the last index ? text.length () -1
        // finishing point: the index 0




        }

    }
}
