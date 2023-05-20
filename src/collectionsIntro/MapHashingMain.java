package collectionsIntro;

import java.util.HashSet;
import java.util.Set;

public class MapHashingMain {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        System.out.println("Java".hashCode());
        set.add("java");
        System.out.println("java".hashCode());
        System.out.println("java...".hashCode());


        System.out.println(set);
        System.out.println(set.contains("java..."));
    }
}
