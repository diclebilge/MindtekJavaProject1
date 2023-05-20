package sundayOOP;

import java.util.Random;

public class MyRandomUtil {

    public static String getPhoneNumber(){

        Random random = new Random();
        int phoneNum = random.nextInt(999_999_9);

        return "773" + phoneNum;

    }

    public static void main(String[] args) {

        System.out.println(getPhoneNumber());
    }
}
