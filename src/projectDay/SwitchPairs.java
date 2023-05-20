package projectDay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwitchPairs {

    //   switchPairs(["four", "score", "and", "seven", "years", "ago"])-> return {"score", "four", "seven", "and", "ago", "years"}
    //   switchPairs(["to", "be", "or", "not", "to", "be", "hamlet"]) -> return {"be", "to", "not", "or", "be", "to", "hamlet"}

    public static void main(String[] args) {
        String[] words = new String[]{"four", "score", "and", "seven", "years", "ago"};

        System.out.println(Arrays.toString(switchPairs(words)));
    }


    public static String[] switchPairs(String[] words){
        for(int i=0;  i < words.length; i=i+2){
            String temp = words[i];
            words[i] = words[i+1];
            words [i+1] = temp;
        }

        return words;
    }
}
