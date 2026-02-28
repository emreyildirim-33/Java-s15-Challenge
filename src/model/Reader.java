package model;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person {
    private List<Book> books;

    public Reader(String name, int id) {
        super(name, id);
        this.books = new ArrayList<>();
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am reader.My name is" + getName());
    }

    public void purchaseBook(Book book) {
        books.add(book);
    }

    public void borrowBook(Book book) {
        books.add(book);
    }

    public void returnBook(Book book) {
        books.remove(book);
    }

    public void showBook(Book book) {
        books.forEach(b -> System.out.println("-" + b.getName()));
    }
}
