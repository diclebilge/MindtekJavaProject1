package sundayClass;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);
        System.out.println("Please, enter num");

        int num1 = input.nextInt();

        Scanner select = new Scanner(System.in);
        System.out.println("Select the operation" +
                "\n1. plus" +
                "\n2. minus" +
                "\n3. multiply" +
                "\n4.divide");

        int operation = input.nextInt();

        System.out.println("Please , enter num2");

        int num2 = input.nextInt();

        if (operation==1) {
            System.out.println((num1 + num2));
        }else if (operation==2) {
            System.out.println(num1 - num2);
        }else if (operation==4) {
                System.out.println(num1 / num2);
            }else{
        System.out.println("Please choose the correct option and try again...");
            }



    }
}