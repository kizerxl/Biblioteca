package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BibliotecaTests {

    private PrintStream printStream;
    private BibliotecaApp bib;
    private ArrayList<Book> books;
    private Book book1, book2;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        books = new ArrayList<Book>();
        bib = new BibliotecaApp(printStream, books);
        book1 = mock(Book.class);
        book2 = mock(Book.class);
        books.add(book1);
        books.add(book2);
    }

    @Test
    public void testPrintsWelcomeMessage() {
        bib.welcomeMessage();

        verify(printStream).println("Welcome!");
    }

    @Test
    public void testPrintsListOfBooks() {
        bib.listBooks();

        when((book1).displayDetails()).thenReturn("myBook1");
        when((book2).displayDetails()).thenReturn("myBook2");
    }

    @Test
    public void testPrintListOfBooksWithAuthorAndYearPublished() {
        when((book1).displayDetails()).thenReturn("myBook1");
        when((book2).displayDetails()).thenReturn("myBook2");

        bib.listBooks();

        for (Book book: books) {
            verify(book).displayDetails();
            verify(printStream).println(book.displayDetails());
        }
    }

}
