package com.example.bankingapp.serviceimpl;

import com.example.bankingapp.dto.PatientDetailsRequest;
import com.example.bankingapp.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String fetchProductDetails(String productType) {
        switch (productType){
            case "Type1":
                return "5 star rated products";
            case "Type2":
                return "4 star rated products";
            default:
                return "Below 3 star rated products";
        }
    }
    @Override
    public String registerPatient(PatientDetailsRequest patientDetailsRequest){
        return null;
    }

}
