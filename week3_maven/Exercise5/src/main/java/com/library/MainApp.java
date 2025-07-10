package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring IoC container from XML config
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean and use it
        BookService bookService = (BookService) context.getBean("bookService");

        // Test output
        bookService.showBookTitle();
    }
}
