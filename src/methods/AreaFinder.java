package methods;

import java.util.Scanner;

public class AreaFinder {
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        // ask a user to select a number :
        // 1 Square
        // 2 Rectangle
        // 3 Circle
        // 4 Triangle
        Scanner input = new Scanner(System.in);
        int selection = getSelection(input);

        // to use a method of any object, I need the object first
        AreaFinder af = new AreaFinder();
        af.startOperations(input, selection, af);
    }

    public void startOperations(Scanner input, int selection, AreaFinder af){
        // if they select 1: ask for a length and print the area of square: l*l
        if(selection==1){
            af.squareAreaHelper(input,af);
        }else if(selection==2){
            // if they select 2: ask for a length and width , print the area of Rectangle : l*w
            af.rectangleAreaHelper(input,af);
        }else if(selection==3){
            // if they select 3: ask for a radius and print the area of circle : r*r*3.14
            af.circleAreaHelper(input,af);
        }else if(selection == 4){
            // if they select 4: ask for a base length and height, print the area of Triangle : bl*h/2
            af.triangleAreaHelper(input,af);
        }else if(selection==5){
            System.out.println("You selected to exit...");
        }else{
            System.out.println("Wrong number, please select from 1 to 5...");
        }
    }

    // name: sqaureArea
    // logic: handle square related operations
    // return: nothing void
    // parameters: Scanner input, AreaFinder obj
    public void squareAreaHelper(Scanner input, AreaFinder af){
        System.out.println("Type the length: ");
        int len = input.nextInt();
        System.out.println("The area of square with the given length is " + af.calcSquareArea(len));
    }

    public void rectangleAreaHelper(Scanner input, AreaFinder af){
        System.out.println("Type the length of rectangle: ");
        int len = input.nextInt();
        System.out.println("Type the width of rectangle: ");
        int wid = input.nextInt();
        System.out.println("The area of rectangle with the given length and width is: " + af.calcRectangleArea(len,wid));
    }

    public void circleAreaHelper(Scanner input, AreaFinder af){
        System.out.println("Type the radius of circle: ");
        int radius = input.nextInt();
        System.out.println("The area of circle with the given radius is "  + af.calcCircleArea(radius));
    }

    public void triangleAreaHelper(Scanner input, AreaFinder af){
        System.out.println("Type the base length: ");
        double baseLen = input.nextDouble();
        System.out.println("Type the height: ");
        double height = input.nextDouble();
        System.out.println("The area of triangle with the given base length and height is: " + af.calcTriangleArea(baseLen, height) );
    }

    private static int getSelection(Scanner input) {
        System.out.println("Select one option: ");
        System.out.println("1 Square");
        System.out.println("2 Rectangle");
        System.out.println("3 Circle");
        System.out.println("4 Triangle");
        System.out.println("5 Exit");
        int selection = input.nextInt();
        System.out.println("The selection is: " + selection);
        return selection;
    }


    // first method. Ask yourself these questions:
    // name of the method? : calcSquareArea
    // what is it going to return? int, boolean, String, char, double... nothing : int
    // what is it going to accept? parameters? how many? what are types of those parameters? : int length
    // what kind of logic it will have inside? -> L*L
    public int calcSquareArea(int length){
        int res = length*length;
        return res;
    }

    // first method. Ask yourself these questions:
    // name of the method? : calcRectangleArea
    // what is it going to return? int, boolean, String, char, double... nothing : int
    // what is it going to accept? parameters? how many? what are types of those parameters? : int length, int width
    // what kind of logic it will have inside? -> L*W
    public int calcRectangleArea(int l, int w){
        return l*w;
    }

    // first method. Ask yourself these questions:
    // name of the method? : calcCircleArea
    // what is it going to return? int, boolean, String, char, double... nothing : double
    // what is it going to accept? parameters? how many? what are types of those parameters? : int r
    // what kind of logic it will have inside? -> r*r*3.14
    public double calcCircleArea(int radius){
        return radius*radius*3.14;
    }

    // first method. Ask yourself these questions:
    // name of the method? : calcTriangleArea
    // what is it going to return? int, boolean, String, char, double... nothing : double
    // what is it going to accept? parameters? how many? what are types of those parameters? : int baseLen, int h
    // what kind of logic it will have inside? -> baseLen*h/2
    //                  af.calcTriangleArea(baseLen, height)
    public double calcTriangleArea(double baseLen, double h){
        return baseLen*h/2;
    }
}