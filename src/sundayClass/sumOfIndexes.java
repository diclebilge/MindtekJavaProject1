package sundayClass;

public class sumOfIndexes {
    public static void main(String[] args) {

        String [] strArr = {"Anna" , "Mila","Nicole", "Ayjan", "Takhira", };

        //count of Indexes if, any string contains letter "A";

        int sum = 0;

        for (int i=0; i < strArr.length; i++){

            if (strArr[i].toLowerCase().contains(("a"))){
                sum += i;

            }


        }
        System.out.println(sum);

    }
}
