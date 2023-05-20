package referenceVars;

public class TestUniversity {
    public static void main(String[] args) {
        University u1 = new University("UIC");
        System.out.println(u1);
        u1.country = " USA";
        System.out.println(u1);

        University u2 = new University(" Lewis", "USA", 600556, false );
        System.out.println(u2);
    }
}
