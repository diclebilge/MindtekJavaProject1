package superHappySundayClass;

public class Factorial {

    public int getFactorial(int num){

        // num = 5;
        // Factorial ---> 1*2*3*4*5
        int factorial = 1;
        for(int i =1; i<=num; i++){
            factorial *= i;

        }
        return factorial;

    }
}
