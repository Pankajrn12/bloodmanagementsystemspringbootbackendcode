package com.blood.bloodmanagementsystem.repositories;

import com.blood.bloodmanagementsystem.entities.BloodDonation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodDonationRepository extends JpaRepository<BloodDonation, Long> {
}
