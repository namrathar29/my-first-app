package com.example.bankingapp.service;

import com.example.bankingapp.dto.PatientProfile;
import com.example.bankingapp.dto.RegisterNewPatient;
import org.springframework.stereotype.Component;

@Component
public interface DentalClinicService {

    String registerPatient(RegisterNewPatient registerNewPatient);

    PatientProfile profileDetails(int patientId);
}
