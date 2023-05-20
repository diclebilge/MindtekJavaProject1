package exceptionsIntro;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("code before exception...");

        int givenAge = 3;
        try {
            validateAge(givenAge);

        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

        System.out.println("code after exception....");

    }
    public static void validateAge (int age ) throws InvalidAgeException{

        if(age < 21 || age > 100){
            throw new InvalidAgeException("The given age is not valid...");
        }

    }

}
