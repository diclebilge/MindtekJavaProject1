package arraysInJava;

import java.util.Arrays;

public class ArraysStringTask1 {
    public static void main(String[] args) {
        // create a string array which can hold up to 5 elements.
        // print your array by using Arrays.toString(x) method
        // one by one add:  "Zebra" , " Eagle" , "Dog" , "Cat" , "Mouse" to your array
        // print your array by using Arrays.toString(x)method

        String [] animals = new String[]{ "Zebra" , " Eagle" , "Dog" , "Cat" , "Mouse"};
        System.out.println(Arrays.toString(animals));
        animals [0] ="Zebra";
        animals [1] = "Eagle";
        animals [2] = "Dog" ;
        animals [3] = "Cat";
        animals [4] = "Mouse";

        System.out.println(Arrays.toString(animals));

        // create a new array and put elements inside of animals into your new array in reverse order
        String [] animals2 = new String[5];
        animals2 [0] = animals [4];
        animals2 [1] = animals [3];
        animals2 [2] = animals [2];
        animals2 [3] = animals [1];
        animals2 [4] = animals [0];

        System.out.println(Arrays.toString(animals2));


    }
}
