package operators2;

public class Comparisons {
    public static void main(String[] args) {
        //create booleans
        //pattern: type name =value
        boolean isRed = true;
        boolean peopleAreCrossing = false;
        System.out.println(isRed);

        System.out.println("5<10 creates boolean value: " + (5<10));
        System.out.println("5>10 creates boolean value: "+ (5>10));
        System.out.println("5==10 creates boolean value:" + (5==10));
        System.out.println("5 ! = 10 creates boolean value: " + (5!= 10));

        int a = 20;
        int b = 15;

        System.out.println(a + "<" + b + "creates boolean value: " + (a<b));
        System.out.println(a + ">" + b + "creates boolean value:" + (a>b));
        System.out.println(a + "==" +b + "creates boolean value:" + (a==b));
        System.out.println(a + "!=" + b + "creates boolean value: " + (a!= b));
        System.out.println(a+ "<=" +b +"creates boolean value"+ (a<+b));
        System.out.println(a+ ">=" +b  + "creates boolean value:" +(a>=b));







    }
}
