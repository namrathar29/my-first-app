package com.example.bankingapp.controller;

import com.example.bankingapp.dto.StudentDetailsRequest;
import com.example.bankingapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("register-student-details")
    public String registerStudentDetails(@RequestBody StudentDetailsRequest studentDetailsRequest){
        return studentService.registerStudent(studentDetailsRequest);
    }
}
