package com.example.bankingapp.repository;

import com.example.bankingapp.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsDAO extends JpaRepository<Products, Integer> {
}
