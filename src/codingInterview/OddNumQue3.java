package codingInterview;

public class OddNumQue3 {
    public static void main(String[] args) {

        //Get only odd numbers from array. int[] nums={5,3,2,4,7,};

        int[] nums={5,3,2,4,7,};

        for(int num: nums){
            if(num%2==1){
                System.out.println(num);
            }

        }

    }
}
