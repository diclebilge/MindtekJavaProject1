package operators2;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.println("Type temperature in Fahrenheit?: ");
        double Fahrenheit = input.nextDouble();
        double Celsius=(Fahrenheit- 32)*5/9;
        System.out.println("Temperature " + Celsius);
        if(Celsius<0){
            System.out.println("it is very cold. ");
        }else if(Celsius>90){
            System.out.println("it is boiling." );
        }else{
            System.out.println("The weather is good! ");
        }







    }
}
