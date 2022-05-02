package com.example.bankingapp.serviceimpl;

import com.example.bankingapp.dto.StudentDetailsRequest;
import com.example.bankingapp.entity.Student;
import com.example.bankingapp.repository.StudentDAO;
import com.example.bankingapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public String registerStudent(StudentDetailsRequest studentDetailsRequest) {

        Student student = new Student();
        student.setFirstName(studentDetailsRequest.getFirstName());
        student.setLastName(studentDetailsRequest.getLastName());
        student.setGrade(studentDetailsRequest.getGrade());
        student.setSection(studentDetailsRequest.getSection());

        studentDAO.save(student);
        return "Student details registered successfully";
    }
}
