package superHappySundayClass;

import strings.StringIntro;

public class StrBuilderPr {
    public static void main(String[] args) {
        // Create a method which takes one String parameter:
        // it checks the String, if it is palindrome or not.
        // If it is palindrome, return true, otherwise return false;

        // Use StringBuilder. --> reverse(), toString();

        StringBuilder builder = new StringBuilder("Morning");
        System.out.println(builder.capacity());

        StringBuilder builder2 = new StringBuilder();
        System.out.println(builder2.capacity());



    }
    public static boolean palindrome(String str){

        StringBuilder builder = new StringBuilder(str);
        StringBuffer buffer = new StringBuffer("Java");

        String reversed = builder.reverse().toString();

        if(str.equalsIgnoreCase(reversed)){
            return true;
        }

        return false;
    }


    }
