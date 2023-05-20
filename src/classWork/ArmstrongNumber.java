package classWork;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
    Write a program in main method that will print Armstrong numbers between 0 and 999
    * Armstrong number is sum of the cubes of its digits is equal to the number itself.
    For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371
 */

        for (int num=1; num<=999; num++){
            int temp = num;
            int sum = 0;
            do {
                //371
                int digit = temp % 10;
                sum = sum + digit * digit * digit; // sum = 0=1*1*1 -> 1
                temp = temp / 10; //371/10 -> 37
            }while (temp!=0); //0!=0 -> false
            if (num==sum)
                System.out.println(sum + " is armstrong number ");
        }
    }
}





