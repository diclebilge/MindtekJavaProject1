package Conditions;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        // switch (x){}
        // case a: code: break:
        // case b:
        // case c:
        // default: code;
        // }

        Scanner input = new Scanner(System.in);
        System.out.println("What is the number of the week? ");
        int dayNumber = input.nextInt();

        // 1 -> Monday  2 -> Tuesday.... 7-> Sunday
        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not found");
        }

    }
}
