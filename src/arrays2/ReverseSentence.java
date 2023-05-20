package arrays2;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "I love Java";

        // I love Java -> Java love I
        // I love Java -> avaJ evol I

        String[] words = sentence.split(" ");

        String reversed ="";

        // [I, love, Java] -> last index 2=3-1
        for (int i = words.length-1; i >= 0; i--){
            reversed=reversed+words[i]+" ";
        }
        System.out.println(reversed.trim());


        }
    }

