package com.example.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CartDetailsRequest {
    private int cartId;
    private String cartPlatform;

    private List<ProductDetailsRequest> productDetailsRequestList;
}
