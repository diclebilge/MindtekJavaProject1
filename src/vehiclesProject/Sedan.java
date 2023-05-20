package vehiclesProject;

public class  Sedan extends Car {
    private String address;

    public Sedan(String name, String color, int year, String model, String address) {
        super(name,color, year, model);
        this.address = address;
        System.out.println("Hello from Sedan's constructor...");

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void move() {
        System.out.println("Sedan car is driving...");
    }

    @Override
    public void breakPedal() {
        System.out.println("Sedan car us stopping...");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "name='" + this.getName() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", year=" + this.getYear() +
                ", model='" + address + '\'' +
                '}';
    }

}
