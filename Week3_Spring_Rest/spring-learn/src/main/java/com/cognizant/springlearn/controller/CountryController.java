package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.web.bind.annotation.PutMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import jakarta.validation.Valid;
import com.cognizant.springlearn.bean.Country;
import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.service.CountryService;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {

        LOGGER.info("START");

        List<Country> countries = countryService.getAllCountries();

        LOGGER.info("END");

        return countries;
    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code)
            throws CountryNotFoundException {

        LOGGER.info("START");

        Country country = countryService.getCountry(code);

        LOGGER.info("END");

        return country;
    }

    @PostMapping
public Country addCountry(@Valid @RequestBody Country country) {

    LOGGER.info("START");

    LOGGER.debug("Country : {}", country);

    LOGGER.info("END");

    return country;
}
    @PutMapping
public Country updateCountry(@RequestBody Country country) {

    LOGGER.info("START");

    LOGGER.debug("Country : {}", country);

    LOGGER.info("END");

    return country;
}

@DeleteMapping("/{code}")
public void deleteCountry(@PathVariable String code)
        throws CountryNotFoundException {

    LOGGER.info("START");

    Country country = countryService.getCountry(code);

    LOGGER.debug("Deleting Country : {}", country);

    LOGGER.info("END");
}

}