package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Menu {
    private PrintStream printStream;
    ArrayList<String> menuOptions;
    private String userInput = "";
    private BibliotecaApp library;

    public Menu(PrintStream printStream, ArrayList<String> menuOptions, BibliotecaApp library) {
        this.printStream = printStream;
        this.menuOptions = menuOptions;
        this.library = library;
    }

    public void displayMenu(BufferedReader bufferedReader) {
        printOptions();
        getUserInput(bufferedReader);
    }

    private void getUserInput(BufferedReader bufferedReader) {
        try {
            userInput = bufferedReader.readLine();

            System.out.println(


            );
            if(userInput.equals("List Book")) {
                library.listBooks();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printOptions() {
        printStream.println("Here are your options:\n");
        for (String option:
             menuOptions) {
            printStream.println(option);
        }
    }
}
