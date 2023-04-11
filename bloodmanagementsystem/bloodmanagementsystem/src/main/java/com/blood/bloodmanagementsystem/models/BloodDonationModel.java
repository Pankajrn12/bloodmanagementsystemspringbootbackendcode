package com.blood.bloodmanagementsystem.models;

import java.util.Date;

public class BloodDonationModel {
    private Long BloodDonationId;
    private Long donorId;
    private Long bloodBankId;
    private String bloodType;


    public Long getBloodDonationId() {
        return BloodDonationId;
    }

    public void setBloodDonationId(Long bloodDonationId) {
        BloodDonationId = bloodDonationId;
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

    @Override
    public String toString() {
        return "BloodDonationModel{" +
                "BloodDonationId=" + BloodDonationId +
                ", donorId=" + donorId +
                ", bloodBankId=" + bloodBankId +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
