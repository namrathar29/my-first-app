package com.example.bankingapp.service;

import com.example.bankingapp.dto.BaseResponse;
import com.example.bankingapp.dto.StudentDetailsRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface StudentService {

    String registerStudent(StudentDetailsRequest studentDetailsRequest);

    ResponseEntity<BaseResponse> getStudentDetails(int rollNumber);
}
