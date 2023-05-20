package collectionsIntro;

import java.sql.Array;
import java.util.*;

public class HashMapTask4 {
    public static void main(String[] args) {
        ArrayList<Person> people = createPeople();

        //check if people list has duplicate values
        boolean isUnique = elementsAreUnique(people);
        if (isUnique) System.out.println("The list has unique people");
        else System.out.println("The list contains duplicate people");


//        Map<String, ArrayList<Person>> map = new HashMap<>();
//        // people : under20, between20And30, over30
//        map.put("under20", new ArrayList<Person>());
//        map.put("between20And30", new ArrayList<Person>());
//        map.put("over30", new ArrayList<Person>());
//
//
//        groupPeopleByAge(map,people);
//        System.out.println(map);
//        System.out.println("============");
//
//        //fullName length <15,    btw15And20,   moreThan20
//        Map<String, ArrayList<Person>> map1 = new HashMap<>();
//        map1.put("lessThan15" , new ArrayList<Person>());
//        map1.put("btw15And20", new ArrayList<>());
//        map1.put ("moreThan20" , new ArrayList<>());
//        groupPeopleByFullNameLength(map1, people);
//        System.out.println(map1);

    }

    private static boolean elementsAreUnique(ArrayList<Person> people) {

        HashSet<Person> set = new HashSet<>();
        for(Person person: people) {
            if (set.contains(person)) return false;
            else set.add(person);
    }

        return true;
    }


    private static void groupPeopleByFullNameLength(Map<String, ArrayList<Person>> map1, ArrayList<Person> people) {
        for(Person person: people){
            int length = person.getfName().length() + person.getlName().length();
            if (length < 15) map1.get("lessThan15").add(person);
            else if (length>=15 && length<=20) map1.get("btw15And20").add(person);
            else if (length>20) map1.get("moreThan20").add(person);

            }
        }

    private static void groupPeopleByAge(Map<String, ArrayList<Person>> map, ArrayList<Person> people) {
        for(Person person: people){
            int age = person.getAge();
            if(age<20) map.get("under20").add(person);
            else if (age>=20 && age<=30) map.get("between20And30").add(person);
            else if (age>30) map.get("over30").add(person);
        }

    }

    private static ArrayList<Person> createPeople() {

        Person p1 = new Person("Jack", "Peterson" , 23);
        Person p2 = new Person("Jess", "Smith" , 35);
        Person p3 = new Person("Ross", "Peter" , 27);
        Person p4 = new Person("Joe", "Son" , 67);
        Person p5 = new Person("Chandler", "Gray" , 12);
        Person p6 = new Person("Rachel", "Swift" , 45);
        Person p7 = new Person("Scott", "Merkel" , 18);
        Person p8 = new Person("Brad", "Peterson" , 33);
        ArrayList<Person> people = new ArrayList<>(Arrays.asList (p1,p2,p3,p4,p5,p6,p7,p8));

        return  people;

    }
}
