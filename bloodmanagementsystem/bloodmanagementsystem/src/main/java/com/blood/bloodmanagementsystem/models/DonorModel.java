package com.blood.bloodmanagementsystem.models;

import java.util.Date;

public class DonorModel {
    private Long donorId;
    private String donorName;
    private String donorBloodType;
    private String donorMobileNumber;
    private String donorAddress;
    private String lastDonationDate;


    public Long getDonorId() {
        return donorId;
    }

    public void setDonorId(Long donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorBloodType() {
        return donorBloodType;
    }

    public void setDonorBloodType(String donorBloodType) {
        this.donorBloodType = donorBloodType;
    }

    public String getDonorMobileNumber() {
        return donorMobileNumber;
    }

    public void setDonorMobileNumber(String donorMobileNumber) {
        this.donorMobileNumber = donorMobileNumber;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getLastDonationDate() {
        return lastDonationDate;
    }

    public void setLastDonationDate(String lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }

    @Override
    public String toString() {
        return "DonorModel{" +
                "donorId=" + donorId +
                ", donorName='" + donorName + '\'' +
                ", donorBloodType='" + donorBloodType + '\'' +
                ", donorMobileNumber='" + donorMobileNumber + '\'' +
                ", donorAddress='" + donorAddress + '\'' +
                ", lastDonationDate='" + lastDonationDate + '\'' +
                '}';
    }
}
