package com.example.bankingapp.controller;

import com.example.bankingapp.dto.BaseResponse;
import com.example.bankingapp.dto.CartDetailsRequest;
import com.example.bankingapp.service.CartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartsController {

    @Autowired
    private CartsService cartsService;

    @PostMapping("fill-cart")
    public ResponseEntity<BaseResponse> fillCart(@RequestBody CartDetailsRequest cartDetailsRequest){
        if(cartDetailsRequest == null){
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("Cart details cannot be null");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.BAD_REQUEST);
        }
        return cartsService.fillCartWithProducts(cartDetailsRequest);
    }

}
