package codingInterview;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {

        String str="aaabbcccdda";
        str=str.toLowerCase();

        // H=1, e=1, l=2, o=1

        Map<Character, Integer> map=new HashMap<>();

        for(int i=0; i<str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                // H=1
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        System.out.println(map);
    }

}
