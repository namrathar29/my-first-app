package com.example.bankingapp.repository;

import com.example.bankingapp.entity.Carts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartsDAO extends JpaRepository<Carts, Integer> {
}
