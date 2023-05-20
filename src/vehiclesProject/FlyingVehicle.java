package vehiclesProject;

public class FlyingVehicle extends  Vehicle{
    private double speed;
    private double weight;

    public FlyingVehicle(String name, String color, int year, double speed, double weight){

        super(name, color, year);
        this.speed = speed;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
