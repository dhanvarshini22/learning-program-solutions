package com.example.countryapp.controller;

import com.example.countryapp.entity.Country;
import com.example.countryapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public ResponseEntity<Country> addCountry(@RequestBody Country country) {
        return ResponseEntity.ok(countryService.addCountry(country));
    }


    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountry(@PathVariable String code) {
        return countryService.getCountryByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{code}")
    public ResponseEntity<Country> updateCountry(@PathVariable String code, @RequestBody Country country) {
        return ResponseEntity.ok(countryService.updateCountry(code, country));
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<String> deleteCountry(@PathVariable String code) {
        countryService.deleteCountry(code);
        return ResponseEntity.ok("Country deleted successfully");
    }

    @GetMapping("/search")
    public ResponseEntity<List<Country>> searchCountry(@RequestParam String name) {
        return ResponseEntity.ok(countryService.searchCountriesByName(name));
    }

    @GetMapping
    public ResponseEntity<List<Country>> getAllCountries() {
        return ResponseEntity.ok(countryService.getAllCountries());
    }
}
