package vehiclesProject;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("my car", "white", 2020, "kia");
        System.out.println(c1);

        // write a method to change name, color, and model to uppercase
        doUppercase(c1);
        System.out.println(c1);
        Car c2 = c1;
        c2.setColor("red");
        System.out.println(c1);
    }

    public static void doUppercase(Car carObj){
        carObj.setName(carObj.getName().toUpperCase());
        carObj.setColor(carObj.getColor().toUpperCase());
        carObj.setColor(carObj.getModel().toUpperCase());

    }

}
