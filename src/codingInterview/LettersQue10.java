package codingInterview;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class LettersQue10 {
    public static void main(String[] args) {
        // Write a code that counts number of letters in String? String str=”Java”; output: J=1, a=2, v=1

        String str = "Java";
        str = str.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            if(!map.containsKey(str.charAt(i))){

                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        System.out.println(map);
        }
    }



