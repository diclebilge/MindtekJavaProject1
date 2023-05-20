package vehiclesProject;

public class MilitaryPlane extends FlyingVehicle {

    private int amountOfBombs;
 public MilitaryPlane (String name, String color, int year, double speed, double weight){
     super(name, color, year,speed,weight);
     this.amountOfBombs = amountOfBombs;

 }

    public int getAmountOfBombs() {
        return amountOfBombs;
    }

    public void setAmountOfBombs(int amountOfBombs) {
        this.amountOfBombs = amountOfBombs;
    }
}
