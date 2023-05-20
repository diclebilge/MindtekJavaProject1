package superHappySundayClass;

public class Palindrome {

    public  void checkPalindrome(String str){

        String reversed = " ";
        boolean isPalindrome = false;

        for(int i= str.length()-1; i>=0; i--){

            reversed += str.charAt(i);

        }

        if(str.equalsIgnoreCase(reversed)) {
            System.out.println("It is  palindrome");
        }else{
            System.out.println("not palindrome");


        }
             isPalindrome = false;



    }
}
