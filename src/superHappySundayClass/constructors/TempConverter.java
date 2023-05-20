package superHappySundayClass.constructors;

public class TempConverter {

    public int f;

    // Create a class TempConverter
    // This class to have one instance variable int f;
    // This class hast to have one constructor with one parameter and init variable;
    // This class also has one method which will convert from Fahrenheit ---> Celsius and
    // Print out message your entered temp in Celsius will be Celsius;

    // int c= (f-32)* 5/9;

    public TempConverter(int f) {
        this.f = f;
        getTemp();
    }

        public void getTemp() {
            int c = (f - 32) * 5 / 9;

            System.out.println("Your entered temperature in Celsius " + c);

        }









}
