package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {
    PrintStream printStream;

    public BibliotecaApp(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void welcomeMessage() {
        printStream.println("Welcome!");
    }
}
