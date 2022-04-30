package com.example.bankingapp.controller;

import com.example.bankingapp.dto.HistoryOfPatientId1;
import com.example.bankingapp.dto.MetroCardUserDetailsRequest;
import com.example.bankingapp.dto.PatientProfile;
import com.example.bankingapp.dto.RegisterNewPatient;
import com.example.bankingapp.service.DentalClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DentalClinicController {

    @Autowired
    private DentalClinicService dentalClinicService;

    @PostMapping("register-new-patient")
    public String registerPatientVisitingClinic(@RequestBody RegisterNewPatient registerNewPatient){
        return dentalClinicService.registerPatient(registerNewPatient);
    }

    @GetMapping("get-patient-profile/{patientId}")
    public PatientProfile fetchPatientProfile(@PathVariable int patientId) {
        return dentalClinicService.profileDetails(patientId);
    }

    @PostMapping("fill-patient-history-details")
    public String fillPatientHistoryDetails(@RequestBody HistoryOfPatientId1 historyOfPatientId1){
        return dentalClinicService.fillPatientHistory(historyOfPatientId1);
    }

    @GetMapping("get-patient-profile-and-history/{patientId}")
    public PatientProfile fetchPatientProfileWithHistory(@PathVariable int patientId) {
        return dentalClinicService.profileDetailsWithHistory(patientId);
    }
}
