package sundayClass;

import strings.StringMethods1;

import java.util.Scanner;

public class StrMethods {
    public static void main(String[] args) {
        //substring();
        //starsWith();
        //endWith();
        //trim;
//if word start with "A" (ignore the case), then move first letter of the word to the end of the word print out. Ex:APPLE
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word");
        String word = input.next();

        if (word.startsWith("A") && word.endsWith("k")) {
            String result = word.substring(1, word.length() - 1);
            System.out.println(result);
        } else if (word.startsWith("A")) {
            String front = word.substring(0, 1);
            String back = word.substring(1);
            String result = back + front;

            System.out.println(result);


        } else if (word.endsWith("k")) {
            System.out.println(word.substring(word.length() - 1) + word.substring(1, word.length() - 1));

        } else {
            System.out.println(word);

        }

    }
}






