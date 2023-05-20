package operators2;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        System.out.println("Type an int  number: ");
        int num = input.nextInt();

        if (num>0){
            System.out.println("The given number is positive.");

        }else if (num<0){
        System.out.println("The given number is negative.");
        }else{
            System.out.println("The given number is zero.");
        }
        System.out.println("The end");



    }
}
