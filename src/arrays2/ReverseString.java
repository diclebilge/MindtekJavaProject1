package arrays2;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String[] words={"Hi", "Java", "String"};

        for(int i=0; i<words.length; i++){
            String str=words[i];

            // avaJ
            String reversed="";

            //      index=3            ;      3>=0;  3, 2, 1, 0
            for(int index=str.length()-1; index>=0; index--){
                reversed=reversed+str.charAt(index);
                // avaJ
            }
//            System.out.println(reversed);
            words[i]=reversed;
        }
        System.out.println(Arrays.toString(words));




    }

}
