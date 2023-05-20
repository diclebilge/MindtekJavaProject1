package projectDay;

public class TaskEFruit {
    public static void main(String[] args) {
        // Write a program that finds common fruits from two below baskets:
        String[] basket1 = {"Orange", "Apple", "Kiwi", "Peaches", "Watermelon"};
        String[] basket2 = {"Melon", "Kiwi", "Banana", "Apple", "Kiwi"};

        String fruit = "Common fruits:";


        for (int i = 0; i < basket1.length; i++) {
            for (int a = 0; a < basket2.length; a++) {
                if (basket1[i].equals(basket2[a])) {
                    fruit = fruit + basket2[a];
                }
            }
        }
    }
}