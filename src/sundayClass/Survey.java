package sundayClass;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        // We are doing a survey about Mindtek:
        // Ask user to give a point from 0 to 5;
        //If it is:
        //1 = poor;
        //2 = not satisfied;
        //3 = fair;
        //4 = good;
        //5 = very satisfied;
        //*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please ,rate Mindtek school on a scale from 1 to 5");
        int rate = input.nextInt();

        switch (rate) {
            case 1:
                System.out.println("Poor");
                break;
            case 2:
                System.out.println("Not satisfied");
                break;
            case 3:
                System.out.println("fair");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Very Satisfied");
                break;
            default:

        }

    }
}
