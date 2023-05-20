package arrays2;

public class Methods {

    public int add(int num1, int num2){
        int total = num1+num2;
        return total;

    }
    public static void main(String[] args) {
        // Object
        Methods myMethod = new Methods();

        System.out.println(myMethod.add(2, 3));
        System.out.println(myMethod.add(100, 25));
    }

        public int multiply(int num1, int num2,int num3){
            int total = num1*num2*num3;
            return total;
        }


    }


