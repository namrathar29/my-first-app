package com.example.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class RegisterNewPatient {

    private int patientId;
    private String name;
    private String emailId;
    private String mobileNumber;
    private String createPassword;

}
