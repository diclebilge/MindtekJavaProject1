package classWork;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//80-100  -> A
//60-79 -> B
// 40-59 ->C
// 0-39 -> F

public class ifGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the grade?");
        int scale = input.nextInt();

        if (80 <= scale && scale <= 100) {
            System.out.println("A");
        } else if (60 <= scale && scale <= 79) {
            System.out.println("B");
        } else if (40 <= scale && scale <= 59) {
            System.out.println("C");
        } else if (0 <= scale && scale <= 39) {
            System.out.println("F");
        }else{
            System.out.println("Not found");
        }
    }
}





