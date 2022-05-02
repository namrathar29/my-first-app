package com.example.bankingapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class LoanDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loanId;

    private String customerName;
    private String loanType;
    private double interest;
}
