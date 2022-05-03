package com.example.bankingapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class Carts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;

    private String cartPlatform;

    @OneToMany(mappedBy = "carts")
    private List<Products> products;
}
