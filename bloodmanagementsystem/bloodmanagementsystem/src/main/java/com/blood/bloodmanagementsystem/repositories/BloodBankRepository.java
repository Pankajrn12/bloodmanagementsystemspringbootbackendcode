package com.blood.bloodmanagementsystem.repositories;

import com.blood.bloodmanagementsystem.entities.BloodBank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodBankRepository extends JpaRepository<BloodBank, Long> {
}
