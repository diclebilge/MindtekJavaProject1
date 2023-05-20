package vehiclesProject;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//

        //totally fine
 //       Car c2 = new Sedan("My car", "white", 200, "Toyota", "Illinois");


        // risky, might loose values
        Sedan s2 = (Sedan) new Car("My car", "white", 200, "Toyota");



    }


}
