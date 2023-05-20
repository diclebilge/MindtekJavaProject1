package sunnySunday;

public class MainTestClass {
    public static void main(String[] args) {

        Instagram account1 = new Instagram();
        account1.setUserName("Mindtek");
        account1.setPassword("Mindtek2023");

        account1.clickLogin("Mindtek", "Mindtek2023");
    }
}
