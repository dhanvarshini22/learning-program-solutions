package com.cognizant;

import com.cognizant.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
        LOGGER.info("Main method started...");
        displayCountry();
    }

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        LOGGER.info("Getting first country bean...");
        Country country1 = context.getBean("country", Country.class);

        LOGGER.info("Getting second country bean...");
        Country country2 = context.getBean("country", Country.class);

        LOGGER.debug("Country 1: {}", country1);
        LOGGER.debug("Country 2: {}", country2);

        LOGGER.info("Are both country beans same? {}", (country1 == country2));
    }

}
