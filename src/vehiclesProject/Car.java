package vehiclesProject;

public class Car extends Vehicle   {
    private String model;

    public Car(String name, String color, int year, String model) {
        super(name, color, year); // new Vehicle(name, color, year)
        this.model = model;
        System.out.println("Hello from Car's constructor...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void move() {
        //super.move();
        System.out.println("Car is driving...");
    }

    public void breakPedal(){
            System.out.println("Car is stopping...");
        }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + this.getName() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", year=" + this.getYear() +
                ", model='" + model + '\'' +
                '}';
    }

}

