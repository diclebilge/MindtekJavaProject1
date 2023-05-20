package inheritanceIntro;

public class Dog extends Animal{

    private String location;

    public Dog(String name, int age, boolean isPet, String location) {
        super(name, age, isPet);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", isPet=" + this.isPet() +
                ", location='" + location + '\'' +
                '}';
    }
}

