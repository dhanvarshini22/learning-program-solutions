package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("START getAllCountries()");
        List<Country> countryList = (List<Country>) context.getBean("countryList");
        LOGGER.info("END getAllCountries()");
        return countryList;
    }
}
