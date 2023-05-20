package arraysInJava;

public class ArrayTask2 {
    public static void main(String[] args) {
        String[] countries = new String[]{"USA", "Canada", "France", "China", "Ukraine", "Turkey", "Japan",
                "Australia", "Morocco", "Egypt", "Portugal", "Brazil", "Argentina" , "Chile", "Uganda"};

        // print each country:
        // countries []
        //System.out.println(countries.length);

        for (int i = 0; i < countries.length; i++) {;
        System.out.println(countries[i]);

    }
        System.out.println("Reverse order:");


    //print each country from countries array in reverse order
        for (int i = countries.length-1; i >= 0; i--){
            System.out.println(countries[i]);
        }


        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);
        System.out.println(countries[3]);
        System.out.println(countries[4]);
        System.out.println(countries[5]);
        System.out.println(countries[6]);
        System.out.println(countries[7]);
        System.out.println(countries[8]);
        System.out.println(countries[9]);
        System.out.println(countries[10]);
        System.out.println(countries[11]);
        System.out.println(countries[12]);

    }
}
