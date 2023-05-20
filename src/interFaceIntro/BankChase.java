package interFaceIntro;

public class BankChase extends Bank implements BankOperations{

    public BankChase(String name, String location) {
        super(name, location);
    }

    @Override
    public double getAPR(String ssn, String fullName) {
        if(fullName.startsWith("B")) return  6.5;
        else return  9.8;
    }

    @Override
    public int displayCreditScore(String fullName) {
        return 800;
    }
}
