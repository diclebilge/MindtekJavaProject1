package project;

import java.util.ArrayList;

public class Library {
    private String name;
    private Address location;
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library(String name, Address location) {
        this.name = name;
        this.location = location;
        this.books = new ArrayList<>();
        this. members = new ArrayList<>();

    }

    public Library(String name, Address location, ArrayList<Book> books, ArrayList<Member> members) {
        this.name = name;
        this.location = location;
        this.books = books;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", books=" + books +
                ", members=" + members +
                '}';
    }
}




