package com.example.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StudentDetailsRequest {

    private int rollNumber;
    private String firstName;
    private String lastName;
    private String grade;
    private String section;
}
