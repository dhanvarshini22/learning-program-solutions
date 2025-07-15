package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START getCountryIndia()");
        Country country = (Country) context.getBean("in");
        LOGGER.info("END getCountryIndia()");
        return country;
    }
}
