package com.sax;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class Catalog {

    private ArrayList<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public void push(Book b) {
        books.add(b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book b : books) {
            sb.append(b.toString());
        }
        return sb.toString();
    }
}