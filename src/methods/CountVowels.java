package methods;

public class CountVowels {
    public static void main(String[] args) {
        CountVowels obj = new CountVowels();
        String s = "Selenium";
        System.out.println("The amount of vowels in : " + s +  " is : " + obj.countVowels(s));
    }

    public int countVowels(String text){
        int count = 0;
        text = text.toLowerCase();
        // count vowel letters
        for (int i = 0; i < text.length(); i++) {
            // if char located at index i is a,e,i,o,u then increment count
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u')
                count = count + 1;

            System.out.println(text.charAt(i));
        }
        return count;
    }
}


