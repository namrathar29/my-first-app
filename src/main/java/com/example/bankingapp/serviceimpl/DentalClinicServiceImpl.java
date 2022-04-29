package com.example.bankingapp.serviceimpl;

import com.example.bankingapp.dto.PatientProfile;
import com.example.bankingapp.dto.RegisterNewPatient;
import com.example.bankingapp.entity.Profile;
import com.example.bankingapp.entity.RegisterPatient;
import com.example.bankingapp.repository.ProfileDAO;
import com.example.bankingapp.repository.RegisterPatientDAO;
import com.example.bankingapp.service.DentalClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
