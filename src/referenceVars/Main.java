package referenceVars;

public class Main {
    public static void main(String[] args) {
        // primitive vars: int, double, boolean, long,char... -> stored in stack memory
        // reference vars: String... objects of any class     -> stored in heap memory


        // how to create an object?
        // 1 Need 1 Class : String, Student, Animal : blueprint for creating objects
        // 2 Create your object: Student st1 = new Student();
        // pattern               Type objName = new Type ();
        // "new" -> go and allocate some memory to store this new object, heap memory

        Student st1 = new Student();
        st1.age = 27;
        st1.fname = "Jake";
        st1.lname = "Smith";
        st1.gender = "Male";

        st1. displayInfo();
        st1. disPlayAge();

        Student st2 = st1;
        st2.displayInfo();

        st2. fname = "Liza";
        System.out.println(st1);
        System.out.println(st2);

        System.out.println("------");
        st1.displayInfo();
        System.out.println(st1.fname);
        st1 = new Student();
        st2 = new Student();

    }
}
