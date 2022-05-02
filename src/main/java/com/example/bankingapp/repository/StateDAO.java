package com.example.bankingapp.repository;

import com.example.bankingapp.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateDAO extends JpaRepository<State, Integer> {
}
