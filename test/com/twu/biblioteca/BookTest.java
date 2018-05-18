package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void testDisplayDetailsShowsAllDetails() {
        Book book = new Book("Moby Dick", "Herman Melville", "1851");
        String details = "Moby Dick\tHerman Melville\t1851";
        assertEquals(book.displayDetails(), details);
    }

}