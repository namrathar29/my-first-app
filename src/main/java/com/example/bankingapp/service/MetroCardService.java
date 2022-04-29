package com.example.bankingapp.service;

import com.example.bankingapp.dto.MetroCardUserDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface MetroCardService {
    String registerUser(MetroCardUserDetailsRequest metroCardUserDetailsRequest);

    MetroCardUserDetailsRequest getUserDetails(int userId);
}
