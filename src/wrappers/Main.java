package wrappers;
// Wrapper Classes:
// what: int -> Integer, double -> Double, char -> Character, boolean -> Boolean
// why:
    // 1 data structures in java can hold only objects (exception: Array)
    // 2 multithreading
// how to use: int a = 5; Integer a = 5; boolean isHere=false; Boolean isHere = false;

public class Main {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 6;
        System.out.println(a+b);
        String amount = "127";
        // convert your string to integer:
        int c = Integer.parseInt(amount);
        System.out.println(c);

        int m = Integer.min(a,b);
        System.out.println(m);

        int max = Integer. max(a,b);
        System.out.println(max);

        //convert almost anything to String: toString()
        String test = a.toString();
        System.out.println(test);

        // convert string formatted number to not int but to Integer then use: Integer.valueOf()
        Integer f = Integer.valueOf(amount);
        System.out.println(f);


    }

}
