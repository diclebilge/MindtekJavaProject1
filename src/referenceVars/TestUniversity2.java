//package referenceVars;
//
//import java.util.Arrays;
//
//public class TestUniversity2 {
//    public static void main(String[] args) {
//        University u1 = new University("Lewis", "USA", 600556, false);
//        University u2 = new University("Oxford", "UK", 600556, true);
//        University u3 = new University("Harvard", "USA", 600556, true);
//        University u4 = new University("Istanbul", "Turkiye", 600556, true);
//        University u5 = new University("Chinese State University", "China", 600556, true);
//        University u6 = new University("St Petersburg University", "Russia", 600556, false);
//        University u7 = new University("Depaul", "USA", 600556, false);
//        University u8 = new University("Springfield", "USA", 600556, false);
//        University u9 = new University("Mindtek", "Universal", 600556, false);
//        University u10 = new University("Berlin State University", "Germany", 600556, true);
//        University u11 = new University("Paris Liberal Arts University", "France", 600556, true);
//
//        University[] universities = new University[]{u1, u2, u4, u5, u6, u7, u8, u9, u10, u11};
//        // printNames(universities);
//        // printNamesFromUSA(universities);
//        // printUniNamesByCountry(universities, "Turkiye" );
//        //  printUniNamesOfTop100(universities);
//        University [] unisInUsa = universityList (universities, "USA");
//        System.out.println(Arrays.toString(unisInUsa));
//        System.out.println("-------");
//        University [] unisInUK = universityList (universities, "UK");
//        System.out.println(Arrays.toString(unisInUK));
//    }
//
//    // task 5 return array of units that are located in given country
//    static University[] universityList(University[] universities, String countryName) {
//        // amount?
//        int amount = 0;
//        for (University u : universities)
//            if (u.country.equals(countryName))
//                amount++;
//
//        University[] unis = new University[amount];
//        int index = 0;
//        for (University u : universities) {
//            if (u.country.equals(countryName)) {
//                unis[index] = u;
//                index++;
//            }
//
//        }
//
//        return unis;
//    }
//
//
//
//        // task 4 print all universities which are in top 100
//
//        private static void printUniNamesOfTop100 (University[]universities){
//            for (University u : universities) {
//                if (u.isInTop100)
//                    System.out.println(u.name);
//            }
//        }
//
//        // task 3 print all uni names that match with given country: printUniNameByCountry(University[] universities, String country
//        private static void printUniNamesByCountry (University[]universities, String country){
//            for (University u : universities) {
//                if (u.country.equals(country))
//                    System.out.println(u.name);
//
//            }
//        }
//
//
//        // task 2 all university names which are located in USA
//        static void printNamesFromUSA (University[]universities){
//            for (University u : universities) {
//                if (u.country.equals("USA"))
//                    System.out.println(u.name);
//            }
//        }
//
//
//        // task 1 print all name of universities: printName
//
//        static void printNames (University[]universities){
//            for (University u : universities) {
//                System.out.println(u.name);
//            }
//
//        }
//
//    }
//  //