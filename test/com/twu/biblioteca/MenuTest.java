package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {
    private ArrayList<String> menuOptions;
    private PrintStream printStream;
    private Library library;
    private BufferedReader bufferedReader;
    private Menu menu;


    @Before
    public void setUp() {
        menuOptions = new ArrayList<String>();
        printStream = mock(PrintStream.class);
        library = mock(Library.class);
        bufferedReader = mock(BufferedReader.class);
        menu = new Menu(printStream, menuOptions, library);
    }

    @Test
    public void testMenuGiveOptionToListBooks() throws IOException {
        String option1 = "List Book";
        menuOptions.add(option1);

        when((bufferedReader).readLine()).thenReturn("List Book");
        menu.displayMenu(bufferedReader);

        verify(printStream).println("Here are your options:\n");
        verify(printStream).println(option1);

    }
    
    @Test
    public void testBooksGetListedWhenUserChoosesOptionToListBooks() throws IOException {
        Menu menu = new Menu(printStream, menuOptions, library);

        when((bufferedReader).readLine()).thenReturn("List Book");
        menu.displayMenu(bufferedReader);

        verify(library).listBooks();
    }
}