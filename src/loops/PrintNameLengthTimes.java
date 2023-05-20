package loops;

import java.util.Scanner;

public class PrintNameLengthTimes {
    public static void main(String[] args) {
        // ask a user their name
        // print the name x times
        // x = length of their name
        // "Guli" -> Guli Guli Guli Guli
        // "Ayman" -> Ayman Ayman Ayman Ayman Ayman

        Scanner input = new Scanner(System.in);
        System.out.println("Your name");
        String name = input.next();
        int size = name.length();

        while (size>0){
            System.out.println(name);
            size --;

            }



        }
    }

