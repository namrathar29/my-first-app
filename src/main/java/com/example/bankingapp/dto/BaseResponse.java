package com.example.bankingapp.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@ToString
public class BaseResponse {
    private String message;
    private HttpStatus httpStatus;
    private int httpStatusCode;
    private Object response;
}
