package superHappySundayClass;

import java.util.Arrays;

public class MinAndMax {

    public int[] getMinAndMax(int[] arr) {

        Arrays.sort(arr);

        int[] minAndMax = new int[2];

        minAndMax[0] = arr[0];
        minAndMax[1] = arr[arr.length - 1];

        return minAndMax;
    }
}

