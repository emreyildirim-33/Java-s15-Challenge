package model;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<Book> books;

    public Author(String name, int id) {
        super(name, id);
        this.books = new ArrayList<>();
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am an Author.My name is " + getName());
    }

}
