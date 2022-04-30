package com.example.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PatientProfile {

    private int patientId;
    private String name;
    private String emailId;
    private String mobileNumber;

//    private List<HistoryOfPatientId1> historyOfPatientId1s;
}
