package com.cognizant.springlearn.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CountryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetCountry() throws Exception {

        mockMvc.perform(get("/country"))
                .andExpect(status().isOk());

    }

    @Test
    public void testGetAllCountries() throws Exception {

        mockMvc.perform(get("/countries"))
                .andExpect(status().isOk());

    }

    @Test
    public void testGetCountryByCode() throws Exception {

        mockMvc.perform(get("/countries/IN"))
                .andExpect(status().isOk());

    }

    @Test
    public void testInvalidCountry() throws Exception {

        mockMvc.perform(get("/countries/XYZ"))
                .andExpect(status().isNotFound());

    }

}