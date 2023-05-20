package strings;

public class StringEquals {
    public static void main(String[] args) {
        //Equals(text):accepts one string parameter, return true if equals or false if not equals
        String comp1 = "canon";
        String comp2 = "canoN";

        //check if com1 has the same value with comp2 => if values are identical then true will be returns
        System.out.println(comp1.equals(comp2));

        System.out.println(comp1.equalsIgnoreCase(comp2));
    }
    
}
