package com.cognizant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringLearnApplication {

    public static void main(String[] args) {
        System.out.println("Main method started...");
        displayDate();
    }

    public static void displayDate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            // Get the current date and time
            Date currentDate = new Date();

            // Format the current date using the format bean
            String formattedDate = format.format(currentDate);

            // Print formatted date
            System.out.println("Current Date: " + formattedDate);

            // Print full date and time using default format
            System.out.println("Current Date & Time (default): " + currentDate);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
