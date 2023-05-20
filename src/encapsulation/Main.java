package encapsulation;

import referenceVars.University;
// to control access to vars and method use access modifiers: public, private, protected

public class Main {
    public static void main(String[] args) {
        University u1 = new University();
        //with private you can not use obj.field syntax
        // u1.name = "Chicago" is not allowed
        // u1.setName ("Chicago");

        System.out.println(u1);
        //assign by using setters
        u1.setName("Chicago University");
        u1.setCountry("USA");
        u1.setZipCode((60656));
        u1.setInTop100(true);
        System.out.println(u1);

        String uniName = u1.getName();
        System.out.println(uniName);
        u1.setInTop100(false);
        System.out.println(u1);


    }

}
