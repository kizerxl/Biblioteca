package com.twu.biblioteca;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class Main {
    private static ArrayList<Book> books;
    private static ArrayList<String> menuOptions;
    private static Menu menu;
    private static Library bibApp;

    public static void main(String[] args) {
        createBooks();

        bibApp = new Library(System.out, books);

        createMenu();

        bibApp.welcomeMessage();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        menu.displayMenu(bufferedReader);
    }

    private static void createBooks() {
        books = new ArrayList<Book>();
        Book book1 = new Book("Outliers", "Malcom Gladwell", "2006");
        Book book2 = new Book("Cat In The Hat", "Dr. Suess", "1951");
        books.add(book1);
        books.add(book2);
    }

    private static void createMenu() {
        menuOptions = new ArrayList<String>();
        String option1 = "List Book";
        menuOptions.add(option1);

        menu = new Menu(System.out, menuOptions, bibApp);
    }
}
