package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {
    PrintStream printStream;
    ArrayList<Book> books;

    public Library(PrintStream printStream, ArrayList books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void welcomeMessage() {
        printStream.println("Welcome!");
    }

    public void listBooks() {
        for(Book book: books) {
            printStream.println(book.displayDetails());
        }
    }
}
