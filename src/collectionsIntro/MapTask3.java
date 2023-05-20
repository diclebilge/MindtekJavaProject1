package collectionsIntro;

import java.util.HashMap;
import java.util.Map;

public class MapTask3 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,-5,6,7,8,8,7,-6,5,4,3,2,-1};

        // "Positive numbers" -> x
        // "Negative numbers" -> y

        Map<String, Integer> map = new HashMap<>();
        map.put("Positive Numbers",0);
        map.put("Negative Numbers",0);

        for(int num: arr){
        if(num>0) map.put("Positive Numbers", map.get("Positive Numbers") +1);
        else map.put("Negative Numbers", map.get("Negative Numbers") +1) ;

        }
        System.out.println(map);

        for(Map.Entry<String, Integer> myMap: map.entrySet()){
            System.out.println("Key:" + myMap.getKey());
            System.out.println("Value:" + myMap.getValue());
        }

    }
}
