package referenceVars;

public class ScopeTest {
    static int number = 8;

    public static void main(String[] args) {
        // scope: limits ov variables
        // class level > method level > block level
        // method level:
        double pi = Math.PI;


        int a = 5;
        System.out.println(number);
        String text = "Java";
        printVars(a,text);
        if(text.length()>0){
            int b = a;
            System.out.println("text is not empty...");
            b = 6;
        }

        a = 89;

        for(int i = 0; i < text.length(); i++){
            System.out.println(a);
        }

        for(int i = 0; i < text.length(); i++){
            System.out.println(a);
        }

        if(true) {
            int c = 78;

        }

    }

    static void printVars(int num, String word) {
        number = 89;
        System.out.println(num);
        System.out.println(word);
    }
}