package com.twu.biblioteca;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {
    @Test
    public void testMenuGiveOptionToListBooks() throws IOException {
        ArrayList<String> menuOptions = new ArrayList<String>();
        String option1 = "List Books";
        menuOptions.add(option1);

        PrintStream printStream = mock(PrintStream.class);
        BibliotecaApp bib = mock(BibliotecaApp.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);

        Menu menu = new Menu(printStream, menuOptions, bib);

        when((bufferedReader).readLine()).thenReturn("List Book");
        menu.displayMenu(bufferedReader);

        verify(printStream).println("Here are your options:\n");
        verify(printStream).println(option1);

    }
    
    @Test
    public void testBooksGetListedWhenUserChoosesOptionToListBooks() throws IOException {
        PrintStream printStream = mock(PrintStream.class);
        BibliotecaApp bib = mock(BibliotecaApp.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);

        ArrayList<String> menuOptions = new ArrayList<String>();
        String option1 = "List Books";
        menuOptions.add(option1);

        Menu menu = new Menu(printStream, menuOptions, bib);

        when((bufferedReader).readLine()).thenReturn("List Book");
        menu.displayMenu(bufferedReader);

        verify(bib).listBooks();
    }
}