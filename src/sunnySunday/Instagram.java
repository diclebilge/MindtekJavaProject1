package sunnySunday;

public class Instagram {

    private String userName;
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void clickLogin(String inputUserName, String inputPassword){

        if (this.userName.equalsIgnoreCase(inputUserName) && this.password.equals(inputPassword)){
            System.out.println("Success!");
        }else {
            System.out.println("Error!");
        }
    }
    public static void printSomething(){
        System.out.println("Printing");
    }

}




