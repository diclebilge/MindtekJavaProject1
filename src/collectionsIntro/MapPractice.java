package collectionsIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>(Arrays.asList("1984", "Java","Python","English"));
        ArrayList<String> books1 = new ArrayList<>(Arrays.asList("Animal Farm", "Web Design","Python","English"));
        ArrayList<String> books2 = new ArrayList<>(Arrays.asList("Spanish", "C#","Python","Atomic Habits"));
        ArrayList<String> books3 = new ArrayList<>(Arrays.asList("1984", "Self Help","Python","English"));



        // 1 Mount Prospect, 2 Des Plaines, 3 Park Ridge, 4 Skokie
        // Mount Prospect -> books
        // Des Plaines -> books1
        // Park Ridge -> books2
        // Skokie -> books3

        Map <String, ArrayList <String> > map = new HashMap<>();
        map.put("Mount Prospect", books);
        map.put("Mount Prospect", books1);
        map.put("Park Ridge", books2);
        map.put("Skokie", books3);

        System.out.println(map);

        // print libr names that have a book called "Atomic Habits"
        for(Map.Entry<String, ArrayList<String>> myMap:map.entrySet()){
            System.out.println("Library name: "  + myMap.getKey());
            System.out.println("Value: " + myMap.getValue());

        }

    }
}
