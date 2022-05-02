package com.example.bankingapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roll_number")
    private int rollNumber;

    @Column(name= "first_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column(name= "grade")
    private String grade;

    @Column(name= "section")
    private String section;
}
