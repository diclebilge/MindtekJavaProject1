package interFaceIntro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankChase b1= new BankChase("Chase", "Chicago");


        BankOperations bo = new BankBofa("Bofa", "Chicago");

        System.out.println(bo.displayCreditScore("Andrey"));
        System.out.println(bo.getAPR("134243", "Andrey"));

        ArrayList<String> myList = new ArrayList<>();


        List<String> list = new LinkedList<>();
    }
}
