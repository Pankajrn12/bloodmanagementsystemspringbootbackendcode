package com.blood.bloodmanagementsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
        return "Staff{" +
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
