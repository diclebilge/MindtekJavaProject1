package referenceVars;

public class StaticTest {
//    static{
//        System.out.println("Hello from static block 2");
//  }

    public static void main(String[] args) {
        // static methods/blocks are executed at the very beginning of app start
        // app start with the main method
        // ONLY static methods can call other static methods
        // non static methods can be called ONLY by using an object
        // static methods are called by Class name
        // non static methods can call static methods

        System.out.println("Hello from main static method");

        StaticTest st1= new StaticTest();
        st1.printTwice("java");

        print ("Hello Java");
    }
    public void printTwice(String s){
        System.out.println("------");
        print(s);
        print (s);
        System.out.println("-------");

    }

    public static void print (String text){
        System.out.println(text);
    }


    static{
        System.out.println("hello from static block 1");

    }

}
