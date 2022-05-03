package com.example.bankingapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String productName;
    private String productPrice;
    private String productQuantity;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private  Carts carts;
}
