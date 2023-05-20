package arraysInJava;

public class ArrayTask3 {
    public static void main(String[] args) {
        String[] countries = new String[]{"USA", "Canada", "France", "China", "Ukraine", "Turkey", "Japan",
                "Australia", "Morocco", "Egypt", "Portugal", "Brazil", "Argentina", "Chile", "Uganda"};

        //print countries which starts with letter a or A
        int count = 0;

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].toLowerCase().startsWith("p")) {
                System.out.println(countries[i]);
                count++;
            }
        }
        System.out.println("Amount of countries that start with p is " + count);

    }
}
