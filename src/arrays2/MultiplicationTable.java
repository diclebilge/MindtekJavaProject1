package arrays2;

public class MultiplicationTable {

    public static void main(String[] args) {
/*
        1*1 = 1
        1*2 = 2

        ...
        10*1=10
        10*2=20
        .....
*/
        for (int a = 1; a <=10; a++) {

            for (int b = 1; b <= 10; b++) {
                System.out.println(a+ "*" +b + " = " + a*b);

            }
            System.out.println("-------");
        }


    }
}
