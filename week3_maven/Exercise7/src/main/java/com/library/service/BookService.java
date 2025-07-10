package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String librarianName;  // Constructor injection
    private BookRepository bookRepository;  // Setter injection

    // Constructor for librarian name
    public BookService(String librarianName) {
        this.librarianName = librarianName;
    }

    // Setter for repository injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBookDetails() {
        String title = bookRepository.getBookTitle();
        System.out.println("Librarian: " + librarianName);
        System.out.println("Book Title: " + title);
    }
}
