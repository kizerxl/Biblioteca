package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        BibliotecaApp bibApp = new BibliotecaApp(System.out, books);
        bibApp.welcomeMessage();
        bibApp.listBooks();


    }
}
