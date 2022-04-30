package com.example.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class HistoryOfPatientId1 {
    private int serialNumber;
    private String date;
    private String time;
    private String doctor;
    private  String prescription;
    private int amountPaid;
}
