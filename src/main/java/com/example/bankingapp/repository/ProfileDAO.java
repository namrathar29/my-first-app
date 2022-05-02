package com.example.bankingapp.repository;

import com.example.bankingapp.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProfileDAO extends JpaRepository<Profile, Integer> {

    @Query(value = "SELECT * FROM profile WHERE name=?1", nativeQuery = true)
    Profile findByName(String name);

    @Query(value = "SELECT * FROM profile WHERE patient_id=?1 and name=?2", nativeQuery = true)
    Profile findByNameAndId(int patientId, String name);
}
