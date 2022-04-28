package com.example.bankingapp.service;

import com.example.bankingapp.dto.PatientDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String fetchProductDetails(String productType);

    String registerPatient(PatientDetailsRequest patientDetailsRequest);


}


