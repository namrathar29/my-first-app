package com.example.bankingapp.service;

import com.example.bankingapp.dto.CountryDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public interface CountryService {

    CountryDetailsResponse countryDetails(int countryId);
}
