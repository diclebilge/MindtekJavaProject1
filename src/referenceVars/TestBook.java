package referenceVars;

public class TestBook {
    public static void main(String[] args) {
        Book b1= new Book();
        b1.bookId = 12;
        b1.author = "Leo Tolstoy";
        b1.isDigital = true;
        Book b2 = new Book("G.Orwell" ,11, "German");



    }
}
