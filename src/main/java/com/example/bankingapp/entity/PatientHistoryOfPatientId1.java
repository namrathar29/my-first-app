package com.example.bankingapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "patient_history_of_patient_id_1")
public class PatientHistoryOfPatientId1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sl_no")
    private int serialNumber;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "doctor")
    private String doctor;

    @Column(name = "prescription")
    private  String prescription;

    @Column(name = "amount_paid")
    private int amountPaid;
}
