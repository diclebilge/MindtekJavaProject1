package wrappers;

import java.util.ArrayList;
import java.util.Arrays;
// Array                                        vs                                      ArrayList
// array must have a fixed sized when created                                          flexible size
//                                                                                     provides easy methods: get,set,add, remove
public class ArraysListIntro {
    public static void main(String[] args) {
        //create : ArrayList <integer> list = new ArrayList(); -> any class or any Wrapped types but not primitive
        ArrayList<Integer> list = new ArrayList<>(3);
        // add elements
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);


        // read elements
        System.out.println (list.get(0));

        // change element located at Index 2
        list.set(2,100);

        // remove element at specific index:
        list.remove(1);

        // check if empty?
        System.out.println(list.isEmpty());

        // length of arraylist?
        System.out.println(list.size());

        //check if your list contains given integer a
        list.contains(100);
        list.indexOf(100);

        // print
        System.out.println(list);
        System.out.println("The length of arraylist: " + list.size());

        System.out.println("========");


        // create
        int [] arr = new int[3];

        // add elements
        arr[0] = 55;
        arr[1] = 66;
        arr[2] = 77;
    //    arr[3] = 88;

        //read elements
        System.out.println(arr[0]);


        // print
        System.out.println(Arrays.toString(arr));
        System.out.println("The length of array: " + arr.length);

    }
}
