package com.example.bankingapp.serviceimpl;

import com.example.bankingapp.dto.CountryDetailsResponse;
import com.example.bankingapp.entity.Country;
import com.example.bankingapp.repository.CountryDAO;
import com.example.bankingapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAO countryDAO;
    @Override
    public CountryDetailsResponse countryDetails(int countryId) {
        Optional<Country> country = countryDAO.findById(countryId);
        Country country1 = country.get();

        CountryDetailsResponse countryDetailsResponse = new CountryDetailsResponse();
        countryDetailsResponse.setCountryId(country1.getCountryId());
        countryDetailsResponse.setCountryName(country1.getCountryName());
        countryDetailsResponse.setCountryCapital(country1.getCountryCapital());
        countryDetailsResponse.setCountryCurrency(country1.getCountryCurrency());
        countryDetailsResponse.setCountryPopulation(country1.getCountryPopulation());

        return countryDetailsResponse;

    }
}
