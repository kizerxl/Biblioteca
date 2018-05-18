package com.twu.biblioteca;

public class Book {
    private String title, author, year; 
    
    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String displayDetails() {
        String result = title+"\t"+author+"\t"+year;
        return result;
    }
}
