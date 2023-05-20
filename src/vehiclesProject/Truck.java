package vehiclesProject;

public class Truck extends Car {
    private double length;



    public Truck(String name, String color, int year, String model, double length) {
        super(name, color, year, model);
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println("The truck is driving...");
    }

    @Override
    public void breakPedal() {
        System.out.println("Truck is stopping...");

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return"Truck{" +
                "name='" + this.getName() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", year=" + this.getYear() +
                ", model='" + this.getModel() + '\'' +
                ", length=" + this.getLength() +
                '}';
    }


}


