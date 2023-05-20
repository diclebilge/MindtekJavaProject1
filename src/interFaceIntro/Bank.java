package interFaceIntro;

public abstract class Bank implements BankOperations{
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Bank(String name, String location) {
        this.name = name;
        this.location = location;


    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }


    @Override
    public double getAPR(String ssn, String fullName) {
        return 0;
    }

    @Override
    public int displayCreditScore(String fullName) {
        return 0;
    }
}
