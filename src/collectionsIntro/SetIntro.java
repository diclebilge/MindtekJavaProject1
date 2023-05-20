package collectionsIntro;

import java.util.HashSet;

public class SetIntro {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        System.out.println("Before addition: " + hset);

        hset.add(5);
        hset.add(15);
        hset.add(25);
        hset.add(15);


        System.out.println("After addition: " + hset);

        // iterate no indexes.
        for(int num: hset){
            System.out.println(num);
        }
    }
}
