package collectionsIntro;

import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(66);
        numbers.push(77);
        numbers.push(52);
        numbers.push(661);
        numbers.push(776);
        numbers.push(500);
        numbers.push(-966);
        numbers.push(-77);
        numbers.push(45);
        numbers.push(666);
        numbers.push(123);

        // create 2 stacks: posNumbers, negNumbers.

        Stack<Integer> pos = new Stack<>();
        Stack<Integer> neg = new Stack<>();

        while (!numbers.isEmpty()){
            int num = numbers.pop();
            if(num > 0) pos.push(num);
            else if (num < 0) neg.push(num);

        }

        System.out.println("Positives: " + pos);
        System.out.println("Negatives: " + neg);
    }
}
