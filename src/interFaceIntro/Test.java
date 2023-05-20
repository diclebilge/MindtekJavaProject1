package interFaceIntro;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        BankChase chase = new BankChase("Chase", "Chicago");
        BankBofa bofa = new BankBofa("Bofa" , "Chicago");
        BankCreditU creditU = new BankCreditU("Credit Union" , "Skokie");


        ArrayList<Bank> banks = new ArrayList<>();
        banks.add(chase);
        banks.add(bofa);
        banks.add(creditU);

        // print how much APR each bank will provide for a given ssn and fullName
        printAPRs("123456789", "Jacob Brown", banks);

    }

    private static void printAPRs(String ssn, String fullName, ArrayList<Bank> banksList) {
        for(Bank b: banksList){
            System.out.println(b.getName() + " bank offers " + b.getAPR(ssn,fullName) + " APR");
        }
    }


}

