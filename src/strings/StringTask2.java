package strings;

public class StringTask2 {
    public static void main(String[] args) {
        //.ChaAt(index) -> accepts one int parameter, returns are one character

        String company = "Toshiba";

        System.out.println(company.charAt(4));

        //get the last character
        System.out.println("The last: " + company.charAt(3));
        //System.out.println("The last" + company.charAt(8));
        int lastIndex= company. length() -1;
        System.out.println("The last:" + company.charAt(lastIndex));

        // find middle index
        int middIndex = company.length()/2;
        System.out.println("middIndex: " + middIndex);
        System.out.println("Char at middIndex: is " + company.charAt(middIndex));

    }
}
