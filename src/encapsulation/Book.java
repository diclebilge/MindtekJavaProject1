package encapsulation;
// how do you create an immutable class?
// 1st: make all my fields "private"
// 2nd: do not create setter methods

// make bookId not modifiable.
// immutable: can not change/add/edit values of fields
public class Book {
    // state
    private String author;
    private int bookId;
    String language;
    private boolean isOriginal;
    private boolean isDigital;

    //cons
    public Book(){};

    public Book(String author, int bookId, String language){
        this.author = author;
        this.bookId = bookId;
        this.language = language;
    }

    //methods\


    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isOriginal() {
        return isOriginal;
    }

    public boolean isDigital() {
        return isDigital;
    }

    @Override
    public String toString() {
        return "Book{" +
                " author='" + author + '\'' +
                ", bookId=" + bookId +
                ", language='" + language + '\'' +
                ", isOriginal=" + isOriginal +
                ", isDigital=" + isDigital +
                '}';
    }

}
