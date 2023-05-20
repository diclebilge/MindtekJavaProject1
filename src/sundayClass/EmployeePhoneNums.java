package sundayClass;

public class EmployeePhoneNums {
    public static void main(String[] args) {


        String[] firstNames = {"Steven", "Tiger", "Rabbit", "Wolf"};

        String[] lastNames = {"King", "Lions", "Fox", "Dogs"};

        String[] phoneNumbers = {"123", "456", "789", "102"};


        //print out: "Steven King's phone number is 123

        for (int i = 0; i < firstNames.length; i++) {
            System.out.println(firstNames[i] + " " + lastNames[i] + "" +  " 's phone number is " + phoneNumbers[i]);
        }
        }

    }

