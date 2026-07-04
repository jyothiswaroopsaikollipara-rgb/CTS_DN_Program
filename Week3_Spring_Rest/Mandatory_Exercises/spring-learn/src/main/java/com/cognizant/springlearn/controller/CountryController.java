package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.bean.Country;
import com.cognizant.springlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public Country getCountry() {

        return countryService.getCountry();

    }
    
    @GetMapping("/countries")
    public List<Country> getAllCountries(){

        return countryService.getAllCountries();

    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

    return countryService.getCountry(code);

}

}