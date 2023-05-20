package Conditions;

public class if2 {
    public static void main(String[] args) {
        //scanner
        int age = 18;

        //if 25 <= age < 30 print Your age is between 25 and 30
        //if 30 <= age < 35 print Your age is between 30 and 35
        //if 35 <= age < 40 print Your age is between 35 and 40

        if (25 <= age && age < 30) {
            System.out.println("Your age is between 25 and 30");
        } else if(30<=age && age<35) {
                System.out.println("Your age is between 30 and 35");
        }else if(35<=age && age<40) {
            System.out.println("Your age is between 35 and 40");
        }else{
            System.out.println("Hello from the last else.");
        }
        System.out.println("The end");
        }
    }
