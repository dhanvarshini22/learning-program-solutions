package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START getCountry() with code: " + code);
        Country country = countryService.getCountry(code);
        LOGGER.info("END getCountry()");
        return country;
    }

    // Already existing endpoints:
    @RequestMapping("/country")
    public Country getCountryIndia() {
        return countryService.getCountry("IN");
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return (List<Country>) countryService.getClass()
                .getClassLoader()
                .getResourceAsStream("countryList");
    }
}
