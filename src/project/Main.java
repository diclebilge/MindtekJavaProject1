package project;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library lib1 = new Library("Mount Prospect Library", new Address("Mount Prospect", 60099));
        Book b1 = new Book("Animal Farm", 98);
        Book b2 = new Book("1984", 150);
        LibService.addBook(lib1, b1);
        LibService.addBook(lib1, b2);


        Member m1 = new Member("Mike Smith", 44);
        Member m2 = new Member("Monica Smith", 38);
        Member m3 = new Member("Paul Smith", 14);
        LibService.addMember(lib1, m1);
        LibService.addMember(lib1, m2);
        LibService.addMember(lib1, m3);

        System.out.println(LibService.containsMember(lib1, "paul smith"));
        LibService.changePage(lib1, "1994", 120);
        LibService.changeAge(lib1, "Mike Smith", 40);
        System.out.println(lib1);


        Library lib2 = new Library("Chicago Public Library", new Address("Chicago", 60656));
        System.out.println(lib2);
        Book b3 = new Book("Peace and War", 980);
        Book b4 = new Book("Java", 350);
        Book b5 = new Book("Atomic Habits", 300);
        Book b6 = new Book("1984", 150);
        Member m4 = new Member("Jacob Jordan", 44);
        Member m5 = new Member("Ali Samed", 40);
        Member m6 = new Member("Henry Gordon", 17);

        ArrayList<Book> listOfBooks = new ArrayList<>(Arrays.asList(b1, b2, b3, b4, b5, b6));
        ArrayList<Member> listOfMembers = new ArrayList<>(Arrays.asList(m1, m2, m3, m4, m5, m6));

        LibService.addMultipleBooks(lib2, listOfBooks);
        LibService.addMultipleMembers(lib2, listOfMembers);
        System.out.println(lib2);

        // get list of members with age < 20 and print it
        // ArrayList<Member> youngMembers = LibService.findMembersInRange(lib2, 10,20);
        // System.out.println(youngMembers);
        //System.out.println(LibService.booksInPageRange(lib2, 500, 1000));

        ArrayList<Library> libraries = new ArrayList<>();
        libraries.add(lib1);
        libraries.add(lib2);
        ArrayList<String> namesOfLibraries = LibService.findBookLibraries(libraries, "Peace and War");
        System.out.println(namesOfLibraries);


    }
}
