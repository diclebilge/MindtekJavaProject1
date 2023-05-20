package interFaceIntro;

public class BankBofa extends Bank implements BankOperations{

    public BankBofa(String name, String location) {
        super(name, location);
    }


    @Override
    public double getAPR(String ssn, String fullName) {
        if(fullName.startsWith("A")) return  5.5;
        else return  8.5;

    }

    @Override
    public int displayCreditScore(String fullName) {
        return 750;
    }
}
