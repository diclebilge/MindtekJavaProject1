package loops;

public class LoopFor {
    public static void main(String[] args) {

        // for loop: for (){}  vs while(condition){}
        // for(starting_point; finish_point; update_logic){code to be executed}
        // starting_point is int; finish_point is int; num = num ++

        //print number from 1 to 55


        for(int i = 1; i<=55; i++) {
            System.out.println(i);

        }
        System.out.println("========");
        int num1 = 1;

        while (num1<=55){
            System.out.println(num1);
            num1++;
        }
    }
}
