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
public class AccountDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;

    private String accountHolderName;
    private String accountType;
    private String balance;
}
