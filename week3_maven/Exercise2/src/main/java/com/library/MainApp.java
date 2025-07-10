package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the service bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Test method (DI will work if output is printed)
        bookService.displayBook();
    }
}
