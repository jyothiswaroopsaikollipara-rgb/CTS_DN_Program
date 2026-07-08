package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.bean.Country;

@Service
public class CountryService {

    private ApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");

    public Country getCountry() {
        return context.getBean("country3", Country.class);
    }

    @SuppressWarnings("unchecked")
    public List<Country> getAllCountries() {

        return (List<Country>) context.getBean("countryList");
    }

    public Country getCountry(String code) throws CountryNotFoundException {

        for (Country country : getAllCountries()) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        throw new CountryNotFoundException();
    }

}