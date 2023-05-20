package superHappySundayClass;

import java.util.Arrays;
import java.util.Scanner;

public class mainTestClass {
    public static void main(String[] args) {

        Login login = new Login();
        Factorial factorial = new Factorial();
        MinAndMax minAndMax = new MinAndMax();
        PracticeStatic pr = new PracticeStatic();
        Palindrome palindrome = new Palindrome();
        Anagrams anagrams = new Anagrams();



        int[] arrInt= {86,2354, 4362,2436,4,46};

        System.out.println(login.loginMethod("mintek@gmail.com", "SmartStudents"));
        System.out.println("Factorial--->" + factorial.getFactorial(7));
        System.out.println("Min and max numbers--->" + Arrays.toString(minAndMax.getMinAndMax(arrInt)));
        System.out.println("Anagrams ----> " + anagrams.isAnagram("listen" , "silent"));

        pr.getString();
        palindrome.checkPalindrome("roof");



    }
}
