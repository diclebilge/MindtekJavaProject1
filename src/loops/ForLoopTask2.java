package loops;

public class ForLoopTask2 {
    public static void main(String[] args) {
        String givenString = "Keyboard";
        //print each char in sep line one from left to right

        for(int index = 0; index<givenString.length(); index++){
            System.out.println(givenString.charAt(index));
        }
    }
}
