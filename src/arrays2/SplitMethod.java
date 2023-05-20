package arrays2;

import java.util.Arrays;

public class SplitMethod {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

    }
}
