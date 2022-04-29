package com.example.bankingapp.controller;

import com.example.bankingapp.dto.MetroCardUserDetailsRequest;
import com.example.bankingapp.dto.PatientDetailsRequest;
import com.example.bankingapp.service.MetroCardService;
import com.example.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MetroCardController {

    @Autowired
    private MetroCardService metroCardService;

    @PostMapping("register-user")
    public String registerNewUser(@RequestBody MetroCardUserDetailsRequest metroCardUserDetailsRequest) {
        return metroCardService.registerUser(metroCardUserDetailsRequest);
    }

    @GetMapping("get-user-details/{userId}")
    public MetroCardUserDetailsRequest fetchUserDetails(@PathVariable int userId) {
        return metroCardService.getUserDetails(userId);
    }
}
