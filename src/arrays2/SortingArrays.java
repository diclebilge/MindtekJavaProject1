package arrays2;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        int []  nums = {4,1,6,10};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String [] colors = {"White", "Black", "Purple", "Red", "Blue", "black","1A"};
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

        String [] values = {"aa", "1A", "Ab", "Ba","2b"};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));

        char c = 'a';


        // 97>100 -> true
        if(c<100){

            System.out.println("Letter 'a' is more than 100 in ASCII table.");
        }
        System.out.println((int)c);

    }


}
