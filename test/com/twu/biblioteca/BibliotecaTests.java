package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    }

    @Test
    public void testPrintsWelcomeMessage() {
        bib.welcomeMessage();

        verify(printStream).println("Welcome!");
    }

    @Test
    public void testPrintsListOfBooks() {
        book1 = mock(Book.class);
        book2 = mock(Book.class);
        books.add(book1);
        books.add(book2);
        bib.listBooks();

        when((book1).displayDetails()).thenReturn("myBook1");
        when((book2).displayDetails()).thenReturn("myBook2");
    }

    @Test
    public void testPrintListOfBooksWithAuthorAndYearPublished() {
        bib.listBooks();
        for (Book book: books) {
            verify(book).displayDetails();
        }
    }
}
