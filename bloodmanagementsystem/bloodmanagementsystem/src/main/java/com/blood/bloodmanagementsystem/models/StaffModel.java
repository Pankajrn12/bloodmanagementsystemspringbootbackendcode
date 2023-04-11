package com.blood.bloodmanagementsystem.models;

import java.util.Date;

public class StaffModel {
    private Long staffId;
    private String staffName;
    private String bloodType;
    private String staffMobileNumber;
    private String address;
    private String doctorName;
    private String hospitalName;
    private Date requireDate;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getStaffMobileNumber() {
        return staffMobileNumber;
    }

    public void setStaffMobileNumber(String staffMobileNumber) {
        this.staffMobileNumber = staffMobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Date getRequireDate() {
        return requireDate;
    }

    public void setRequireDate(Date requireDate) {
        this.requireDate = requireDate;
    }

    @Override
    public String toString() {
        return "StaffModel{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", staffMobileNumber='" + staffMobileNumber + '\'' +
                ", address='" + address + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", requireDate=" + requireDate +
                '}';
    }
}
