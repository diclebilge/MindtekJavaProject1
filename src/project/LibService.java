package project;

import java.util.ArrayList;
import java.util.Arrays;

public class LibService {
    public static void addBook(Library lib, Book book) {
        lib.getBooks().add(book);

    }

    public static void addMember(Library lib, Member member) {
        lib.getMembers().add(member);

    }

    public static boolean containsBook(Library lib, String bookName) {

        for (Book b : lib.getBooks()) {
            if (b.getName().toLowerCase().contains(bookName)) return true;
        }
        return false;
    }

    public static boolean containsMember(Library lib, String fullName) {

        for (Member m : lib.getMembers())
            if (m.getFullName().toLowerCase().contains(fullName)) return true;

        return false;

    }

    public static void changePage(Library lib, String bookName, int pagesAccount) {

        for (Book b : lib.getBooks()) {
            if (b.getName().equalsIgnoreCase(bookName)) {
                b.setPages(pagesAccount);
            }
        }

    }

    public static void changeAge(Library lib, String fullName, int newAge) {
        for (Member m : lib.getMembers()) {
            if (m.getFullName().equalsIgnoreCase(fullName)) {
                m.setAge(newAge);
            }
        }

    }

    public static void addMultipleBooks(Library library, ArrayList<Book> books){

    library.getBooks().addAll(books);

    }

    public static void addMultipleMembers(Library library, ArrayList<Member>members){
        library.getMembers().addAll(members);
    }

    public static ArrayList <Member> findMembersInRange(Library library, int age1, int age2){
        ArrayList<Member> members = new ArrayList<>();
        for(Member member: library.getMembers()){
            if(member.getAge()>= age1 && member.getAge()<= age2){
                members.add(member);
            }
        }
        return members;

    }

    public static ArrayList<Book> booksInPageRange(Library library, int pageForm, int pageTo){
        ArrayList<Book> booksInRange = new ArrayList<>();
        for(Book b: library.getBooks()){
            if(b.getPages()>=pageForm && b.getPages() <= pageTo){

            }
        }
        return booksInRange;
    }
    public static ArrayList<String >findBookLibraries (ArrayList<Library> libraries, String bookName){
        ArrayList<String>libraryNames = new ArrayList<>();
        for(Library lib: libraries){
            for(Book b: lib.getBooks()){
                if(b.getName().equalsIgnoreCase(bookName)){
                    libraryNames.add(lib.getName());
                    break;
                }
            }
        }
        return libraryNames;
    }



}

