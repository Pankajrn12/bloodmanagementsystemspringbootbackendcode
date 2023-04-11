package com.blood.bloodmanagementsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class BloodTransfer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long bloodTransferId;
    private Long donorId;
    private Long staffId;
    private Long bloodBankId;
    private String bloodType;
    private Date bloodTransferDate;


    public Long getBloodTransferId() {
        return bloodTransferId;
    }

    public void setBloodTransferId(Long bloodTransferId) {
        this.bloodTransferId = bloodTransferId;
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

    public Date getBloodTransferDate() {
        return bloodTransferDate;
    }

    public void setBloodTransferDate(Date bloodTransferDate) {
        this.bloodTransferDate = bloodTransferDate;
    }


    @Override
    public String toString() {
        return "BloodTransfer{" +
                "bloodTransferId=" + bloodTransferId +
                ", donorId=" + donorId +
                ", staffId=" + staffId +
                ", bloodBankId=" + bloodBankId +
                ", bloodType='" + bloodType + '\'' +
                ", bloodTransferDate=" + bloodTransferDate +
                '}';
    }
}
