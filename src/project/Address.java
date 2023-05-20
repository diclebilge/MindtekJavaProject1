package project;

public class Address {
    private String city;
    private int zipcode;

    public Address(String city, int zipcode) {
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public int getZipcode() {
        return zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
