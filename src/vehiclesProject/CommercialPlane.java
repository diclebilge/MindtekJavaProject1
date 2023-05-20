package vehiclesProject;

public class CommercialPlane extends FlyingVehicle {
    private int amountOfPeople;

    public CommercialPlane(String name, String color, int year, double speed, double weight, int amountOfPeople) {
        super(name, color, year, speed, weight);
        this.amountOfPeople = amountOfPeople;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {

        this.amountOfPeople = amountOfPeople;

    }

    @Override
    public void move() {
        System.out.println("Plane is flying...");
    }
}
