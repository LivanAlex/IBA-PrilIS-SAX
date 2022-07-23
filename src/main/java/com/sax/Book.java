package com.sax;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String id;
    private String author;
    private String title;
    private String genre;
    private Double price;
    private String publishDate;
    private String description;

    @Override
    public String toString() {
        return title + " " + author + " " + description;
    }
}