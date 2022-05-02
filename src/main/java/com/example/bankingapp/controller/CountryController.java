package com.example.bankingapp.controller;

import com.example.bankingapp.dto.CountryDetailsResponse;
import com.example.bankingapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired CountryService countryService;

    @GetMapping("fetch-country-details/{countryId}")
    public CountryDetailsResponse fetchCountryDetails(@PathVariable int countryId) {
        return countryService.countryDetails(countryId);
    }
}
