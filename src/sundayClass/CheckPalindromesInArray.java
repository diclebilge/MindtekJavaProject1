package sundayClass;

public class CheckPalindromesInArray {
    public static void main(String[] args) {

        String[] words = {"Radar", "Level", "Pop", "City", "Civic", "Long"};


        // Count how many palindrome words does this array of Strings contains.
        // Output : Array has 5 palindrome words.

        // Use Nested for loop and if-else statement.
        // Use count ++;


        int count = 0;

        for (int i = 0; i<words.length; i++){

            String reversed ="";

            String originalWord = words [i];

            for(int j=originalWord.length()-1; j>=0; j--){
                reversed += originalWord.charAt(j);
            }

            if (originalWord.equalsIgnoreCase(reversed)){
                count++;

            }

        }


        System.out.println("Array Contains " + count + " palindrome words.");






    }
}
