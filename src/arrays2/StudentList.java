package arrays2;

import org.w3c.dom.ls.LSOutput;

public class StudentList {

    public static void main(String[] args) {

        String list[] = new String[8];

        list[0] = "Anas";
        list[1] = "Rayhona";
        list[2] = "Aizhan";
        list[3] = "Mila";
        list[4] = "Dicle";
        list[5] = "Maksym";
        list[6] = "Gulzira";
        list[7] = "Maria";

        System.out.println("======FOR TRADITIONAL LOOP");


        for (int i = 0; i < list.length; i++){ ;
        System.out.println(list [i] ) ;
    }

        System.out.println("======FOR EACH LOOP");
        for (String name: list ){
            System.out.println(name);
        }
        System.out.println("=============");
        // print names that contains lower case letter 'a'
        for(String name: list){
            if(name.contains("a")){
                System.out.println(name);
            }
        }


    }
}
