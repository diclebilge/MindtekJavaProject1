package collectionsIntro;

import java.util.HashMap;

public class MapTask1 {
    public static void main(String[] args) {
        int [] ages = new int[]{18,23,78,55,55,55,18,23,23,33,32};

        // find out the amount of each age: 18 -> 1,2,23 -> 3, 78 -> 1...
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int age: ages){
            if(!map.containsKey(age))  map.put(age, 1);
            else map.put(age,map.get(age) + 1);
        }

        System.out.println(map);
    }
}
