package com.example.bankingapp.serviceimpl;

import com.example.bankingapp.dto.HistoryOfPatientId1;
import com.example.bankingapp.dto.PatientProfile;
import com.example.bankingapp.dto.RegisterNewPatient;
import com.example.bankingapp.entity.PatientHistoryOfPatientId1;
import com.example.bankingapp.entity.Profile;
import com.example.bankingapp.entity.RegisterPatient;
import com.example.bankingapp.repository.PatientHistoryOfPatientId1DAO;
import com.example.bankingapp.repository.ProfileDAO;
import com.example.bankingapp.repository.RegisterPatientDAO;
import com.example.bankingapp.service.DentalClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DentalClinicServiceImpl implements DentalClinicService {

    @Autowired
    private RegisterPatientDAO registerPatientDAO;

    @Override
    public String registerPatient(RegisterNewPatient registerNewPatient) {

        RegisterPatient registerPatient = new RegisterPatient();
        registerPatient.setName(registerNewPatient.getName());
        registerPatient.setEmailId(registerNewPatient.getEmailId());
        registerPatient.setMobileNumber(registerNewPatient.getMobileNumber());
        registerPatient.setCreatePassword(registerNewPatient.getCreatePassword());

        registerPatientDAO.save(registerPatient);
        return "Patient registered successfully";
    }


////////////////////////////////////////////////////////////////////////////////////////////////////


    @Autowired
    private ProfileDAO profileDAO;

    @Override
    public PatientProfile profileDetails(int patientId) {

        Optional<Profile> profile = profileDAO.findById(patientId);
        Profile profileDetailsOfPatient = profile.get();

        PatientProfile patientProfile = new PatientProfile();
        patientProfile.setPatientId(profileDetailsOfPatient.getPatientId());
        patientProfile.setName(profileDetailsOfPatient.getName());
        patientProfile.setEmailId(profileDetailsOfPatient.getEmailId());
        patientProfile.setMobileNumber(profileDetailsOfPatient.getMobileNumber());

        return patientProfile;
    }


///////////////////////////////////////////////////////////////////////////////////////////////////


    @Autowired
    private PatientHistoryOfPatientId1DAO patientHistoryOfPatientId1DAO;

    @Override
    public String fillPatientHistory(HistoryOfPatientId1 historyOfPatientId1) {

        PatientHistoryOfPatientId1 patientHistoryOfPatientId1 = new PatientHistoryOfPatientId1();
        patientHistoryOfPatientId1.setDate(historyOfPatientId1.getDate());
        patientHistoryOfPatientId1.setTime(historyOfPatientId1.getTime());
        patientHistoryOfPatientId1.setDoctor(historyOfPatientId1.getDoctor());
        patientHistoryOfPatientId1.setPrescription(historyOfPatientId1.getPrescription());
        patientHistoryOfPatientId1.setAmountPaid(historyOfPatientId1.getAmountPaid());
        patientHistoryOfPatientId1DAO.save(patientHistoryOfPatientId1);
        return "details saved successfully";
    }


///////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public HistoryOfPatientId1 patientHistoryOfId1(int serialNumber) {

        List<PatientHistoryOfPatientId1> patientHistoryOfPatientId1s = patientHistoryOfPatientId1DAO.findAll();
        HistoryOfPatientId1 historyOfPatientId1 = new HistoryOfPatientId1();

        for(PatientHistoryOfPatientId1 patientHistoryOfPatientId1: patientHistoryOfPatientId1s){

            historyOfPatientId1.setDate(patientHistoryOfPatientId1.getDate());
            historyOfPatientId1.setTime(patientHistoryOfPatientId1.getTime());
            historyOfPatientId1.setDoctor(patientHistoryOfPatientId1.getDoctor());
            historyOfPatientId1.setPrescription(patientHistoryOfPatientId1.getPrescription());
            historyOfPatientId1.setAmountPaid(patientHistoryOfPatientId1.getAmountPaid());
        }

        return historyOfPatientId1;
    }


///////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public PatientProfile profileDetailsWithHistory(int patientId) {
        Optional<Profile> profile = profileDAO.findById(patientId);
        Profile profileDetailsOfPatient = profile.get();

        PatientProfile patientProfile = new PatientProfile();
        patientProfile.setPatientId(profileDetailsOfPatient.getPatientId());
        patientProfile.setName(profileDetailsOfPatient.getName());
        patientProfile.setEmailId(profileDetailsOfPatient.getEmailId());
        patientProfile.setMobileNumber(profileDetailsOfPatient.getMobileNumber());


        List<PatientHistoryOfPatientId1> patientHistoryOfPatientId1s = patientHistoryOfPatientId1DAO.findAll();

        for(PatientHistoryOfPatientId1 patientHistoryOfPatientId1: patientHistoryOfPatientId1s){
            HistoryOfPatientId1 historyOfPatientId1 = new HistoryOfPatientId1();
            historyOfPatientId1.setDate(patientHistoryOfPatientId1.getDate());
            historyOfPatientId1.setTime(patientHistoryOfPatientId1.getTime());
            historyOfPatientId1.setDoctor(patientHistoryOfPatientId1.getDoctor());
            historyOfPatientId1.setPrescription(patientHistoryOfPatientId1.getPrescription());
            historyOfPatientId1.setAmountPaid(patientHistoryOfPatientId1.getAmountPaid());
        }

        return patientProfile;
    }


///////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public PatientProfile fetchPatientDetailsByName(String name) {

        Profile profile = profileDAO.findByName(name);

        PatientProfile patientProfile = new PatientProfile();
        patientProfile.setPatientId(profile.getPatientId());
        patientProfile.setName(profile.getName());
        patientProfile.setEmailId(profile.getEmailId());
        patientProfile.setMobileNumber(profile.getMobileNumber());
        return patientProfile;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public PatientProfile fetchPatientProfileByNameAndId(int patientId, String name) {

        Profile profile = profileDAO.findByNameAndId(patientId, name);

        PatientProfile patientProfile = new PatientProfile();
        patientProfile.setPatientId(profile.getPatientId());
        patientProfile.setName(profile.getName());
        patientProfile.setEmailId(profile.getEmailId());
        patientProfile.setMobileNumber(profile.getMobileNumber());
        return patientProfile;
    }


///////////////////////////////////////////////////////////////////////////////////////////////////
}
