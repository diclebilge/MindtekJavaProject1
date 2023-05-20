package operators;

import javax.sound.midi.Soundbank;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is one side");
        double side =  input. nextDouble();

        System.out.println("The area: " + side*side);

        System.out.println("The perimeter: " + (4*side));


    }
}
