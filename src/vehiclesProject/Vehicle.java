package vehiclesProject;

public  class Vehicle {
    private String name;
    private String color;
    private int year;


    public Vehicle(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
        System.out.println("Hello from Vehicle's constructor...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void move(){
        System.out.println("Vehicle is moving...");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
