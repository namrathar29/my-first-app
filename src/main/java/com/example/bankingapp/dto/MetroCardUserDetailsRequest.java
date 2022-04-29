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
public class MetroCardUserDetailsRequest {
    private int userId;
    private String name;
    private String emailId;
    private String cardType;

    private List<ReviewUserResponse> reviews;
}
