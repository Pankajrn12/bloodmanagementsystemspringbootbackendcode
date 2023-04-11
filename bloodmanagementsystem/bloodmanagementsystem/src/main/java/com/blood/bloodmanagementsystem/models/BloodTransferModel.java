package com.blood.bloodmanagementsystem.models;

import java.util.Date;

public class BloodTransferModel {

    private  Long BloodTransferId;
    private Long donorId;
    private Long staffId;
    private Long bloodBankId;
    private String bloodType;


    public Long getBloodTransferId() {
        return BloodTransferId;
    }

    public void setBloodTransferId(Long bloodTransferId) {
        BloodTransferId = bloodTransferId;
    }

    public Long getDonorId() {
        return donorId;
    }

    public void setDonorId(Long donorId) {
        this.donorId = donorId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
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
        return "BloodTransferModel{" +
                "BloodTransferId=" + BloodTransferId +
                ", donorId=" + donorId +
                ", staffId=" + staffId +
                ", bloodBankId=" + bloodBankId +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
