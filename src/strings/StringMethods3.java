package strings;

public class StringMethods3 {
    public static void main(String[] args) {
        // startsWith()(String val ) - > boolean;
        String s = "Java";
        System.out.println(s.startsWith("Ja"));

        // endsWith(String val)-> boolean
        System.out.println(s.endsWith("ava"));

        //replace() ->
        System.out.println(s.replace('a', 'q'));

        String text = "   Hello World !   ";

        //helloworld!  text = "helloworld";
        text = text.toLowerCase().trim().replaceAll(" ", "");

        System.out.println(text);


    }
}
