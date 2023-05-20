package collectionsIntro;

import java.util.HashSet;

public class SetTask {
    public static void main(String[] args) {
        String [] langFromA = new String[]{"English" , "Spanish" , "Russian" , " Turkish"};
        String [] langFromB = new String[]{"English" , "Spanish" , "Chinese" , " Persian", "Japanese"};

        // combine all languages to one place, but do not hold duplicate values
        HashSet<String> langSet = new HashSet<>();
        for(String el : langFromA) langSet.add(el);
        for(String el: langFromB)  langSet.add(el);

        System.out.println(langSet);
    }
}
