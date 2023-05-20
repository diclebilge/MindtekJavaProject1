package referenceVars;

public class Calculator {

    // sum
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {

        return a + b + c;
    }

    public static int sum(int i, int i1, int i2, int i3) {
        return i + i1 + i2 + i3;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int[] nums) {
        int res = 0;
        for (int el : nums) res = res + el;
        return res;
    }

    static int sum(int[] nums1, int[] num2) {
        int res = 0;
        for (int el : nums1) res = res + el;
        for (int el : num2) res = res + el;

        return res;
    }
}


        //sub

        //mul

        // div


