package strings;

import javax.management.remote.JMXAuthenticator;
import java.util.Scanner;

public class FindMiddleChar {
    public static void main(String[] args) {
        //ask a user any word
        //01234
        // "seven" if length is  odd then  print middle letter:v length: 5 (word.length()-1/2 = corr_index  word.charAt(corr_index);
        //012345
        // "number" if length is  even then  print middle letters:m,b length = 6  word.length()/2=3  int= index1 = word.length()/2, int index2=index


        Scanner input = new Scanner(System.in);
        System.out.println("Type a word");
        String word = input.next();

        //check if  length is  even or odd: word=length %2 == 0
        if (word.length()%2==0) {
            System.out.println("The length is even");
        }else{
            System.out.println("The length is odd");
        }

    }
}
