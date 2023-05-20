package sundayClass;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class CountOfOddLength {
    public static void main(String[] args) {

        String [] animals ={"Wolf", "Dog", "Cat" , "Sheep", "Mouse", "Rooster" ,"Chicken", "Goose" , "Monkey"};

        // Print out sum of indexes, only if String length is not even number.

        int sum = 0;

        for (int i = 0; i<animals.length; i++){

            if(animals[i].length()%2 !=0){
                sum +=i;
            }
        }

        System.out.println(sum);
    }


}

