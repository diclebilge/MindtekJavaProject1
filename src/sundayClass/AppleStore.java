package sundayClass;

import java.util.Scanner;

public class AppleStore {
    public static void main(String[] args) {
     // "Hello, welcome to the Apple Store. Please select the phone  that you want to buy."
        //1. Iphone 14 = 950;
        //2. Iphone 14 Pro = 1100;
        //"Please, select a payment option"
         //1. Full payment:
        //2. Finance for 12 month with apple card;
         //"Your monthly payment is" + Iphone14/12;

        double iphone14 = 950;
        double iphone14Pro = 1100;


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Apple Store. Please select the phone  that you want to buy. Please, select a payment option"+
        "\n1. Iphone 14" +
        "\n2. Iphone 14 Pro");
        int phoneType=input.nextInt();


        System.out.println("Please, select a payment option" +
                "\n1. Full payment." +
                "\n2. Finance with apple card for 12 months.");



        int paymentOption = input.nextInt();
        if (phoneType == 1 && paymentOption==1) {
            System.out.println("Your monthly payment is $" + iphone14);

        }else if(phoneType==1 && paymentOption==2){
        System.out.println("Your monthly payment is $" + iphone14/12);

        }else if(phoneType==2 && paymentOption==1) {
            System.out.println("Your total is $" + iphone14Pro);

        }else if(phoneType==2 && paymentOption==2) {
            System.out.println("Your monthly payment is $" + Math.round(iphone14Pro/12));

        }else{
            System.out.println("Error: Please, select the correct option and try again...");






        }













                    }
}
