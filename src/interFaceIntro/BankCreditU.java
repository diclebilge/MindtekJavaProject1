package interFaceIntro;

public class BankCreditU extends  Bank implements  BankOperations{
    public BankCreditU(String name, String location) {
        super(name, location);
    }

    @Override
    public double getAPR(String ssn, String fullName) {
 //       if(fullName.startsWith("J")) return 11;
 //        else return 14;

        return fullName.startsWith("J") ? 11 : 14;
    }

    @Override
    public int displayCreditScore(String fullName) {
        return 0;
    }
}
