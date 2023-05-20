package superHappySundayClass;

import java.util.Arrays;

public class Anagrams {
     public boolean isAnagram(String str1, String str2){

        char [] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
         System.out.println("CHAR ARRAY *****>>> "+ Arrays.toString((arr1)));
         System.out.println("CHAR ARRAY *****>>> "+ Arrays.toString((arr2)));

         Arrays.sort(arr1);
         Arrays.sort(arr2);

         return Arrays.equals(arr1, arr2);

     }
}
