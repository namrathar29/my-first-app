package com.example.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StateDetailsResponse {

    private int stateId;
    private String stateName;
    private String stateCapital;
    private String statePopular;
}
