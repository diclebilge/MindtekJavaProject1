package sunnySunday;

import java.util.ArrayList;

public class ListCount {
    /**
     1. Create a static method which accepts as Parameter Array of Strings and returns int;
     2. Create a new ArrayList of Integers
     3. Convert from String to --> Integer and
     Store all the elements from Array of Strings to  ArrayList of Integers
     4. Count sum of elements in the Array list.

     NOTE: Array of String will contain only numbers in String format;

     Example:

     String[] numsStr = {"3","5","2","16","4"};

     ArrayList<Integer> numsList =  new ArrayList<>();
     sum =30;
     return sum;

     String a = "3;
     Integer b = Integer.valuesOf(a);
     */

    public static void getCount(){

        int sum = 0;

        String[] arr = {"3", "5", "3", "2", "16", "4"};

        ArrayList<Integer> list = new ArrayList<>();

        for (String n : arr){
            String justANumber = n.substring(1);

            list.add(Integer.valueOf(n));
        }
        //count sum of list all the elements in the list;
        // and print it out

        for(int i = 0; i<list.size(); i++ ) {
            sum += list.get(i);
        }
        System.out.println("The sum of elements from the lists is: " + sum);

    }

    public static void main(String[] args) {
        getCount();


    }
}


