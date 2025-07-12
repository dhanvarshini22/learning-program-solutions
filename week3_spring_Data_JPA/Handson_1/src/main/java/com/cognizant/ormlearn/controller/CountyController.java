package com.cognizant.ormlearn.controller;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountyController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping
    public String addCountry(@RequestBody Country country) {
        countryService.addCountry(country);
        return "Country added successfully!";
    }

    @PutMapping
    public String updateCountry(@RequestBody Country country) {
        countryService.updateCountry(country);
        return "Country updated successfully!";
    }

    @DeleteMapping("/{code}")
    public String deleteCountry(@PathVariable String code) {
        countryService.deleteCountry(code);
        return "Country deleted successfully!";
    }
}
