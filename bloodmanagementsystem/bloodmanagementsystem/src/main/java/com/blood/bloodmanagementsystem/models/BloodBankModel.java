package com.blood.bloodmanagementsystem.models;

public class BloodBankModel {
    private Long BloodBankId;
    private String bloodBankName;
    private String bloodBankAddress;

    public Long getBloodBankId() {
        return BloodBankId;
    }

    public void setBloodBankId(Long bloodBankId) {
        BloodBankId = bloodBankId;
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
        return "BloodBankModel{" +
                "BloodBankId=" + BloodBankId +
                ", bloodBankName='" + bloodBankName + '\'' +
                ", bloodBankAddress='" + bloodBankAddress + '\'' +
                '}';
    }
}
