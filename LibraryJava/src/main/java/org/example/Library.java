package org.example;

import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private Book book;

    public Library() {
        this.collection = new ArrayList<>();
    }
    public ArrayList<Book> getCollection() {
        return collection;
    }
    public void addBook(Book _book){
        this.collection.add(_book);
    }

}
