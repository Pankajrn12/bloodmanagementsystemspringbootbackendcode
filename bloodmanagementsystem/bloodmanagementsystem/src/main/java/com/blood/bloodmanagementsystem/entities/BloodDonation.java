package com.blood.bloodmanagementsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BloodDonation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long bloodDonationId;
    private Long donorId;
    private Long bloodBankId;
    private String bloodType;
    private Date bloodDonationDate;


    public Long getBloodDonationId() {
        return bloodDonationId;
    }

    public void setBloodDonationId(Long bloodDonationId) {
        this.bloodDonationId = bloodDonationId;
    }

    public Long getDonorId() {
        return donorId;
    }

    public void setDonorId(Long donorId) {
        this.donorId = donorId;
    }

    public Long getBloodBankId() {
        return bloodBankId;
    }

    public void setBloodBankId(Long bloodBankId) {
        this.bloodBankId = bloodBankId;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public Date getBloodDonationDate() {
        return bloodDonationDate;
    }

    public void setBloodDonationDate(Date bloodDonationDate) {
        this.bloodDonationDate = bloodDonationDate;
    }

    @Override
    public String toString() {
        return "BloodDonation{" +
                "bloodDonationId=" + bloodDonationId +
                ", donorId=" + donorId +
                ", bloodBankId=" + bloodBankId +
                ", bloodType='" + bloodType + '\'' +
                ", bloodDonationDate=" + bloodDonationDate +
                '}';
    }
}
