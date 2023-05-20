package referenceVars;

import java.lang.reflect.AnnotatedArrayType;

public class ObjPractice {
    public static void main(String[] args) {
        // when create an object:
        // 1 the constructor will be called
        // 2 can add own constructor to assign values when you create your object
        // pattern: Type objName = new Type();

        Animal a1 = new Animal();
        a1.name = "cat-Leo";
        a1.age = 2;
        a1.isPet = true;
        a1.printAllInfo();


        System.out.println("-------");
        Animal a2 = new Animal("Dog-Max" ,5 , true);
        a2.printAllInfo();

        Animal a3 = new Animal("Dog-Bobik", 3, true);

        StringBuilder text = new StringBuilder();
        StringBuilder text2 = new StringBuilder("Hello");


    }
}
