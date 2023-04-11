package com.blood.bloodmanagementsystem.repositories;

import com.blood.bloodmanagementsystem.entities.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}
