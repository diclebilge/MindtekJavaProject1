package methods;

import java.util.Arrays;

public class GetLengths {
    public static void main(String[] args) {
        String [] arr= new String [] {"Learn", "School" , "Sun"};
        System.out.println(Arrays.toString(arr));
        GetLengths obj = new GetLengths();
        int [] arrLengths = obj.getLengths(arr);
        System.out.println(Arrays.toString(arrLengths));
    }

    // methodName: getLengths
    // return: int []
    // accept: String[] arr
    // logic: create  int arr, one by one put lengths of words from String arr

    public int [] getLengths(String[] arrOfWords){
        int[] numArr = new int[arrOfWords.length];
        // one by one get element from arrOfWords, calculate its length, put the length into numArrays
        for (int i =0; i<arrOfWords.length; i++){
            numArr[i] = arrOfWords[i].length();
        }
        return  numArr;
    }
}

