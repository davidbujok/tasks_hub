package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Library localLib = new Library();
        Book book = new Book("Title1", "Author1", "Genre1");
        System.out.println(book.getTitle());
        localLib.addBook(book);
    }
}