package arrays2;

import java.util.Arrays;

public class AnagramQuestion {
    public static void main(String[] args) {

        String str1 = "eat";
        String str2 = "ate";

        char[] arr1 = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            arr1[i] = str1.charAt(i);
        }

            System.out.println(Arrays.toString(arr1));

            //String [] arr2 = str2.split("");
            char[] arr2 = str2.toCharArray();
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("=========");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if(Arrays.toString (arr1).equals(Arrays.toString(arr2))){
            System.out.println("It is Anagram ");
        }else{
            System.out.println("It is not Anagram");


        }

        }
    }

