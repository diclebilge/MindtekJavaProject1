package collectionsIntro;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String, Double > map = new HashMap<>();

        // add elements
        map.put("Iphone 14 Max Pro" , 1399.0);
        map.put("Imac 2023 M2", 4500.0);
        map.put("Apple airpods 2" , 150.0);

        // get elements: get values from provided keys
        double price = map.get("Iphone 14 Max Pro");

        // change value of a specific key
        map.put("Imac 2023 M2" , 5500.0);

        map.put("Apple airpods 2" , map.get("Apple airpods 2") + 100.0);

        //remove: .remove(key);
        map.remove("Iphone 14 Max Pro");


        System.out.println(map);

    }
}
