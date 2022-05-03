package com.example.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductDetailsRequest {
    private int productId;
    private String productName;
    private String productPrice;
    private String productQuantity;
}
