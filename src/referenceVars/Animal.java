package referenceVars;

public class Animal {
    // state
    String name;
    int age;
    boolean isPet;


    // constructor
    // looks like a method but without return type
    // each constructor must have the class Name
    // can accept 0 or any amount of parameters(used to initialize a state of object: assign values)
    // every class by default will have 1 empty constructor (hidden)
    // when you add your own constructors you must unhide your default const

    public Animal(){
        System.out.println("Hello from the default constructor");

    }
    public Animal(String name, int age, boolean isPet){
        this.name = name;
        this.age = age;
        this. isPet = isPet;

    }

    // behavior
    void sounds(String sound){
        System.out.println("Says: " + sound);

    }
    void printAllInfo(){
        System.out.println("Animal's name -> " + name);
        System.out.println("Animal's age -> " + age);
        if(isPet) System.out.println("Animal is a pet");
        else System.out.println("Animal is not a pet");


    }
}
