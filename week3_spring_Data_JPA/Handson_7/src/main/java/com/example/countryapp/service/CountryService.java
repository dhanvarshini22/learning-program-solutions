package com.example.countryapp.service;

import com.example.countryapp.entity.Country;
import com.example.countryapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country addCountry(Country country) {
        return countryRepository.save(country); // This line is failing – likely due to bad input
    }

    public Optional<Country> getCountryByCode(String code) {
        return countryRepository.findById(code);
    }

    public Country updateCountry(String code, Country updatedCountry) {
        Country country = countryRepository.findById(code).orElseThrow();
        country.setCoName(updatedCountry.getCoName());
        return countryRepository.save(country);
    }

    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> searchCountriesByName(String name) {
        return countryRepository.findAll().stream()
                .filter(c -> c.getCoName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
