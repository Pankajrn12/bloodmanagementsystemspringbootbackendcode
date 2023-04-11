package com.blood.bloodmanagementsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BloodBank {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long bloodBankId;
    private String bloodBankName;
    private String bloodBankAddress;


    public Long getBloodBankId() {
        return bloodBankId;
    }

    public void setBloodBankId(Long bloodBankId) {
        this.bloodBankId = bloodBankId;
    }

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getBloodBankAddress() {
        return bloodBankAddress;
    }

    public void setBloodBankAddress(String bloodBankAddress) {
        this.bloodBankAddress = bloodBankAddress;
    }

    @Override
    public String toString() {
        return "BloodBank{" +
                "bloodBankId=" + bloodBankId +
                ", bloodBankName='" + bloodBankName + '\'' +
                ", bloodBankAddress='" + bloodBankAddress + '\'' +
                '}';
    }
}
