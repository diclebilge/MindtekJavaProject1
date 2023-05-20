package referenceVars;

public class StringBuilderTest {
    public static void main(String[] args) {

        String animal1 = new String( "Zebra");
        String animal2 = new String( "Lion");


        System.out.println(" == " + (animal1 == animal2));
        System.out.println(animal1.equals(animal2));

        // for objects == compares object's pointers
        // .equals method compares value instead of pointers

        // write a method acc 1 String, ret 1 String in reversed ord
        System.out.println(reverse("Java"));
        StringBuilder text = new StringBuilder("Table");
        System.out.println(text.reverse());
        // immutable class: a clas that never changes, not modifiable.
        System.out.println("======");
        String word = text.toString(); // convert StringBuilder obg to Str objects
        System.out.println("text " + text.getClass());
        System.out.println("word " + word.getClass());
        System.out.println("=====");
        text.append(" appended");
        System.out.println(text);
    }

    public static String reverse(String s){
        StringBuilder rev = new StringBuilder("");
        for (int i= s.length()-1; i>=0; i--) rev = rev.append(s.charAt(i));
        return rev.toString();


    }
}
