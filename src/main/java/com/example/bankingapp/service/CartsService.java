package com.example.bankingapp.service;

import com.example.bankingapp.dto.BaseResponse;
import com.example.bankingapp.dto.CartDetailsRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface CartsService {
    ResponseEntity<BaseResponse> fillCartWithProducts(CartDetailsRequest cartDetailsRequest);
}
