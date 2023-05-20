package sundayClass;

public class NamesSeparated {
    public static void main(String[] args) {

        String [] fullNames = {"Petel Harsh" , "John Doe" , "Steven King", "Donald Trump"};

        //the first name is Petel and the last name  is Harsh
        // use loop and substring.

        for (int i = 0; i<fullNames.length; i++){

            String firstname = fullNames[i].substring (0,fullNames[i].indexOf(" "));
            String lastname = fullNames [i].substring(fullNames[i].indexOf(" ")+1);

            System.out.println("The first  name is " + firstname + " and the last name is " + lastname) ;


        }
    }
}
