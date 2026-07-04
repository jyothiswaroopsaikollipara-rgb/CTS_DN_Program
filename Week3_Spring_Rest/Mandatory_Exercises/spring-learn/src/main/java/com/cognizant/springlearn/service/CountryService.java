package com.cognizant.springlearn.service;

import com.cognizant.springlearn.bean.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.cognizant.springlearn.exception.CountryNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryService.class);

    private static List<Country> countryList = new ArrayList<>();

    static {
        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("JP", "Japan"));
        countryList.add(new Country("AU", "Australia"));
    }

    // Hands-on 4
    public Country getCountry() {

        LOGGER.info("Returning default country");

        return countryList.get(0);
    }

    // Hands-on 5
    public List<Country> getAllCountries() {

        LOGGER.info("Returning all countries");

        return countryList;
    }

    // Hands-on 6
    public Country getCountry(String code) {

    LOGGER.info("Searching country with code {}", code);

    for (Country country : countryList) {

        if (country.getCode().equalsIgnoreCase(code)) {
            return country;
        }

    }

    throw new CountryNotFoundException("Country not found with code : " + code);
    }
}