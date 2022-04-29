package com.example.bankingapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "name")
    private String name;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "card_type")
    private String cardType;
}
