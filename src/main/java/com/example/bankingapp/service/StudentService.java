package com.example.bankingapp.service;

import com.example.bankingapp.dto.StudentDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface StudentService {

    String registerStudent(StudentDetailsRequest studentDetailsRequest);
}
