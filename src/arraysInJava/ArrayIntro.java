package arraysInJava;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // Arrays: linear data structure that holds objects or primitive variables
        // The data is stored in specified indexes starting from 0 up to the end.

        // create an array of integers: type [] name = new type [x];

        int [] arrNumbers =  new int[4];
        // arrNumbers = [0,0,0,0];
        //               0 1 2 3
        // the default value of int is 0;

        // assign a value to the element inside of array:
        arrNumbers[0]= 55;  // arrNumbers = [55,0,0,0]
        arrNumbers[1] = -55;
        // 3rd el is 100, the 4th el is -10
        arrNumbers[2] = 100;
        arrNumbers[3]=-10;

        //change the value, overwrite the value
        arrNumbers [0] = 5;

        arrNumbers [6-3] =7;

        // get access to any value : you need to know the value's index
        System.out.println("The first element's value: "  + arrNumbers[0]);
        System.out.println("The 2nd element's value: "  + arrNumbers[1]);
        System.out.println("The 3rd element's value: "  + arrNumbers[2]);
        System.out.println("The 4th element's value: "  + arrNumbers[3]);
        System.out.println(Arrays.toString(arrNumbers));
    }

}
