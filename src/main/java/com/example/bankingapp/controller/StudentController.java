package com.example.bankingapp.controller;

import com.example.bankingapp.dto.BaseResponse;
import com.example.bankingapp.dto.StudentDetailsRequest;
import com.example.bankingapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("register-student-details")
    public String registerStudentDetails(@RequestBody StudentDetailsRequest studentDetailsRequest){
        return studentService.registerStudent(studentDetailsRequest);
    }

    @GetMapping("get-student-details/{rollNumber}")
    public ResponseEntity<BaseResponse> fetchStudentDetails(@PathVariable int rollNumber) {
        if(rollNumber == 0 || String.valueOf(rollNumber)== null){
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("Roll Number cannot be 0 or null");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.BAD_REQUEST);
        }
        return studentService.getStudentDetails(rollNumber);
    }
}
