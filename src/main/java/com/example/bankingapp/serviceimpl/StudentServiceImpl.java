package com.example.bankingapp.serviceimpl;

import com.example.bankingapp.dto.BaseResponse;
import com.example.bankingapp.dto.StudentDetailsRequest;
import com.example.bankingapp.entity.Student;
import com.example.bankingapp.repository.StudentDAO;
import com.example.bankingapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public ResponseEntity<BaseResponse> getStudentDetails(int rollNumber) {

        BaseResponse baseResponse = new BaseResponse();

        Optional<Student> student = studentDAO.findById(rollNumber);
        if(!student.isPresent()){
            baseResponse.setMessage("Roll Number is not found");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
            return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.NOT_FOUND);
        }

        Student student1 = student.get();

        StudentDetailsRequest studentDetailsRequest = new StudentDetailsRequest();
        studentDetailsRequest.setRollNumber(student1.getRollNumber());
        studentDetailsRequest.setFirstName(student1.getFirstName());
        studentDetailsRequest.setLastName(student1.getGrade());
        studentDetailsRequest.setGrade(student1.getGrade());
        studentDetailsRequest.setSection(student1.getSection());

        baseResponse.setMessage("student details are fetched");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(studentDetailsRequest);
        return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.OK);
    }
}
