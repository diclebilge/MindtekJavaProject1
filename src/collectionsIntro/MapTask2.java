package collectionsIntro;

import operators3.EvenOrOdd;

import java.util.HashMap;

public class MapTask2 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,8,7,6,5,4,3,2,1};

        // "Even numbers" -> x,  "Odd numbers" -> y

        HashMap <String, Integer> map = new HashMap<>();
        map.put("Even Numbers" , 0);
        map.put("Odd Numbers" , 0);

        for(int num: arr) {
            if (num%2==0) map.put("Even Numbers" , map.get("Even Numbers")+1);
            else map.put("Odd Numbers" , map.get("Odd Numbers")+1);
        }


        System.out.println(map);
    }
}
