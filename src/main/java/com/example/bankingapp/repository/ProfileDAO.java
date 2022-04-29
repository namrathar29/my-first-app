package com.example.bankingapp.repository;

import com.example.bankingapp.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileDAO extends JpaRepository<Profile, Integer> {
}
