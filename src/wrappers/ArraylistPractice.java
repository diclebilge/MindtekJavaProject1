package wrappers;

import java.util.ArrayList;
import java.util.Arrays;


public class ArraylistPractice {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>(Arrays.asList("laptop, camera, monitor, keyboard,desk, office,chair"));
        System.out.println(products);
        toUpperCase(products);
        System.out.println(products);
    }

    // convert all products so they are uppercase
    private static ArrayList<String> toUpperCase(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) list.set(i, list.get(i).toUpperCase());
            return list;
        }
    }

