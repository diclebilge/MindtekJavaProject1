package arraysInJava;

public class ArrayForEach {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5};

        //find the total sum of numbers in arr

       int sum =0;
       for(int i=0; i< arr.length; i++){
           sum=sum+arr[i];

       }

        System.out.println("The sum is:" + sum);
    }
}

