package com.example.bankingapp.repository;

import com.example.bankingapp.entity.RegisterPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterPatientDAO extends JpaRepository<RegisterPatient, Integer> {
}
