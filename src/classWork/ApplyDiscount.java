package classWork;

import strings.StringIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class ApplyDiscount {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList("AirPods $230","Magic keyboard $100", "Apple TV $200","iPhone 13 $999"));
        items = applyDiscount (items, 200 ,100 );
        System.out.println(items);


}
    private static ArrayList<String> applyDiscount(ArrayList<String> items, double price, double discPercentage){
        ArrayList<String> list = new ArrayList<>();

        for(String element: items){
            String p1= element.substring(0,element.indexOf("$") + 1);
            int priceOfItem = Integer.parseInt(element.substring(element.indexOf("$") + 1));
            if (priceOfItem >= price) {
                double newPrice = priceOfItem - discPercentage * price / 100;
                p1 = p1 + newPrice;
                list.add(p1);
            }else{
                list.add(element);

            }

            }
            return list;
    }
}
