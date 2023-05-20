package operators;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First side:");
        double S1 = input.nextDouble();
        System.out.println("Second side:");
        double S2 = input.nextDouble();
        double area = S1*S2;
        double perimeter = 2 * (S1+S2);

        System.out.println("The area: " + area);
        System.out.println("The perimeter: " + perimeter);

        }
    }
