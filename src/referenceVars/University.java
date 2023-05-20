package referenceVars;

public class University {


    public String name;
    public String country;
    private int zipCode; // is only acc in this class
    private boolean isInTop100;

    public University (){}

    public University(String name) {
        this.name = name;
    }

    public University(String name, String country, int zipCode, boolean isInTop100) {
        this.name = name;
        this.country = country;
        this.zipCode = zipCode;
        this.isInTop100 = isInTop100;
    }

    @Override
    public String toString(){
        return "University{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", zipCode=" + zipCode +
                ", isInTop100=" + isInTop100 +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public boolean isInTop100() {
        return isInTop100;
    }

    public void setInTop100(boolean inTop100) {
        isInTop100 = inTop100;
    }
}

