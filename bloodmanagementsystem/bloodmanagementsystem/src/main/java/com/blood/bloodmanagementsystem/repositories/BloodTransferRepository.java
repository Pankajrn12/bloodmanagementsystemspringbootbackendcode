package com.blood.bloodmanagementsystem.repositories;

import com.blood.bloodmanagementsystem.entities.BloodTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodTransferRepository extends JpaRepository<BloodTransfer, Long> {
}
