package referenceVars;

public class TestCalculator {
    public static void main(String[] args) {

        int num = Calculator.sum(5, 6);
        System.out.println(num);

        int num1 = Calculator.sum(1, 2, 3);
        System.out.println(num1);

        int num2 = Calculator.sum(2, 3, 4, 5);
        System.out.println(num2);

        double num3 = Calculator.sum(3.5, 3.5);
        System.out.println(num3);
        int[] arr = new int[]{5, 6, 7, 8, 9, 11};
        int res = Calculator.sum(arr);
        System.out.println(res);

        int [] arr1 = new int [] {1,2,3};
        int res2 = Calculator.sum(arr,arr1);
        System.out.println(res2);


    }
}
