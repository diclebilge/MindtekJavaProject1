package strings;

import java.sql.SQLOutput;

public class StringSubstringTask {
    public static void main(String[] args) {
        String word = "Java programming language";

        //print "programing language" portion of word


        System.out.println(word.substring(5));

        //substring(int beg, int end) -> String
        System.out.println(word.substring(5,word.length()-1));

        System.out.println(word.substring(0,4));

        //trim()
        String text = "  Java     ";
        System.out.println(text.length());
        System.out.println(text.trim().length());

        String text2 = " Hello World !  ";

        //remove empty spaces in text2, saved new value in a new string, print

        String text3 = text2.trim();
        System.out.println(text3);






    }
}
