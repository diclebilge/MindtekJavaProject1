package classWork;

public class GetTotal {
    public static void main(String[] args) {
        // Create an array of ints: int[] numbers={4,3,6,5,9,10};
        // Using for loop get sum of even numbers in array.

        int[] numbers = {4,3,6,5,9,10};
        int sum =0;


        for (int i = 0; i< numbers.length; i++ ){
            if (numbers[i]%2 == 0){
                sum = sum + numbers[i];
            }

        }
        System.out.println(sum);
    }
}
