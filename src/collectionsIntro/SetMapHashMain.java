package collectionsIntro;

import java.util.HashSet;
import java.util.Set;

public class SetMapHashMain {
    public static void main(String[] args) {
        Person p1 = new Person("John" , "Smith", 34);
        Person p2 = new Person("John" , "Smith", 37);
        Person p3 = new Person("Matt" , "Smith", 39);


        System.out.println("Ref of p1: " + p1);
        System.out.println("Ref of p2: " + p2);
        System.out.println("Ref of p3: " + p3);


        System.out.println(p1.equals(p2));
        System.out.println("p1: " + p1.hashCode());
        System.out.println("p2: " + p2.hashCode());
        System.out.println("p3: " + p3.hashCode());


        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set);
    }
}
