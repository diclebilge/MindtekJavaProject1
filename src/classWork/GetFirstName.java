package classWork;

public class GetFirstName {
    public static void main(String[] args) {

        //Create array of Strings: String[] employees={"Steven King", "Neena Kochhar", "Alexander Hunold", "David Austin"};
        // Using for loop print only first names of employees.

        String[] employee = {"Steven King", "Neena", "Kochbar", "Alexander Hunold", "David Austin"};

        String[] firstNames = {"Steven", "Neena", "Kochbar", "Alexander", "David"};

        for (int i = 0; i < employee.length; i++) {
            System.out.println(firstNames[i]);

        }
    }
}

