package com.twu.biblioteca;


import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BibliotecaTests {

    private PrintStream printStream;

    @Test
    public void testPrintsWelcomeMessage() {
        printStream = mock(PrintStream.class);
        BibliotecaApp bib = new BibliotecaApp(printStream);
        bib.welcomeMessage();

        verify(printStream).println("Welcome!");
    }

    @Test
    public void testPrintsListOfBooks() {
        printStream = mock(PrintStream.class);
        BibliotecaApp bib = new BibliotecaApp(printStream);
        bib.listBooks();
        verify(printStream).println("Moby Dick, Half a Yellow Sun");
    }
}
