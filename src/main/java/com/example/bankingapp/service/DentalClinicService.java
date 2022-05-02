package com.example.bankingapp.service;

import com.example.bankingapp.dto.HistoryOfPatientId1;
import com.example.bankingapp.dto.PatientProfile;
import com.example.bankingapp.dto.RegisterNewPatient;
import org.springframework.stereotype.Component;

@Component
public interface DentalClinicService {

    String registerPatient(RegisterNewPatient registerNewPatient);

    PatientProfile profileDetails(int patientId);

    String fillPatientHistory(HistoryOfPatientId1 historyOfPatientId1);

    HistoryOfPatientId1 patientHistoryOfId1(int serialNumber);

    PatientProfile profileDetailsWithHistory(int patientId);

    PatientProfile fetchPatientDetailsByName(String name);

    PatientProfile fetchPatientProfileByNameAndId(int patientId, String name);
}
