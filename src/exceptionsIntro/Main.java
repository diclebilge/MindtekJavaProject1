package exceptionsIntro;

public class Main {
    public static void main(String[] args) {
        // prior code
        System.out.println("Code to ask a user two numbers...");
        int a = 4;
        int b = 0;
        String s = "123";
        System.out.println("Before exc...");

        int num = 0;
        try{
            System.out.println("In try block 1");
            num = Integer.parseInt(s);
            System.out.println("In try block 2");
        } catch (RuntimeException e){
            System.out.println("Hello from catch block");
            System.out.println(e);
        }
        //   int num = Integer.parseInt(s);
        System.out.println(num);
        System.out.println("After exc...");

        // logic to do division
        int result = 0;
        try {
            result = a/b;
        } catch (Exception e) {
            System.out.println(e);
        }

        // rest code
        System.out.println("all other logic...");
        System.out.println(result);
    }
}








