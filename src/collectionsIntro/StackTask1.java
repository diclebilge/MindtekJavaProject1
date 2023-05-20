package collectionsIntro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class StackTask1 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,55,66,5,4,3,7,8,8,8,8,99};

        // print only unique values from arr
        HashSet <Integer> set = new HashSet<>();
        for (Integer el: arr) set.add(el);

        System.out.println(set);
        set.remove(199);

        System.out.println("After removal: " + set);
        System.out.println(set.size());



    }
}
