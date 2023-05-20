package abstractionIntro;

public class Main {
    public static void main(String[] args) {
        Radio r = new Radio();

        // final variable: you can not change the value...
        final int num = 5;
        final String text = "Java";

        final Radio rad = new Radio(); //@sfas123
        rad.model = "Horizon";
        rad.model = "LG";

    }
}
