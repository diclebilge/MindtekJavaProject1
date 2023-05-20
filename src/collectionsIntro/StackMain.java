package collectionsIntro;

import java.util.Stack;

public class StackMain {
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

        System.out.println(numbers);

        Stack<Integer> evenNumbers = new Stack<>();
        Stack<Integer> oddNumbers = new Stack<>();

        // your code here
        // write a code to put all even integers from "numbers" stack to "evenNumbers" stack
        // write a code to put all odd integers from "numbers" stack to "oddNumbers" stack

        // 0 use loop : while stack is not empty keep doing some work
        // 1 take out the top el of numbers stack : pop ()
        // 2 check of that elements is even or odd : if (el%2==0)
        // 3 if even then odd to evenNumbers stack : evenNumbers.push(el);
        // 4 else add the el to oddNumbers stack : oddNumbers.push(el);

        while (!numbers.isEmpty()){
            int el = numbers.pop();
            if (el % 2 == 0) {
                evenNumbers.push(el);
            } else { oddNumbers.push(el);
            }

        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}

