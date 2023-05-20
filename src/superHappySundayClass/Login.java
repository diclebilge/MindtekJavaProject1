package superHappySundayClass;

import java.util.stream.Stream;

public class Login {

    public String loginMethod(String userName, String password){

        String expectedUserName = "mindtek@gmail.com ";
        String expectedPassword  = "SmartStudents";


        if(expectedUserName.equals(userName) && expectedPassword.equals(password)){

            return "Welcome to the Home Page!";
        }

        return "Error...";

    }

}
