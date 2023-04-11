package com.blood.bloodmanagementsystem.resources;

import com.blood.bloodmanagementsystem.models.*;
import com.blood.bloodmanagementsystem.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blood")
public class StaffResource {
    @Autowired
    StaffService staffService;

    @PostMapping("/saveStaffAllDetails")
    public ResponseEntity saveStaffAllDetails(@RequestBody StaffModel staffModel){
        return staffService.saveStaffAllDetails(staffModel);
    }
    @PostMapping("/saveDonorAllDetails")
    public ResponseEntity saveDonorAllDetails(@RequestBody DonorModel donorModel){
        return staffService.saveDonorAllDetails(donorModel);
    }

    @PostMapping("/saveBloodBankAllDetails")
    public ResponseEntity saveBloodBankAllDetails(@RequestBody BloodBankModel bloodBankModel){
        return staffService.saveBloodBankAllDetails(bloodBankModel);
    }

    @PostMapping("/saveBloodDonationAllDetails")
    public ResponseEntity saveBloodDonationAllDetails(@RequestBody BloodDonationModel bloodDonationModel){
        return staffService.saveBloodDonationAllDetails(bloodDonationModel);
    }
    @PostMapping("/saveBloodTransferAllDetails")
    public ResponseEntity saveBloodTransferAllDetails(@RequestBody BloodTransferModel bloodTransferModel){
        return staffService.saveBloodTransferAllDetails(bloodTransferModel);
    }

    @PostMapping("/updateStaffAllRecordsDetails")
    public ResponseEntity updateStaffAllRecordsDetails(@RequestBody StaffModel staffModel){
        return staffService.updateStaffAllRecordsDetails(staffModel);
    }

    @PostMapping("/updateDonorAllDetails")
    public ResponseEntity updateDonorAllDetails(@RequestBody DonorModel donorModel){
        return staffService.updateDonorAllDetails(donorModel);
    }

    @PostMapping("/updateBloodBankAllDetails")
    public ResponseEntity updateBloodBankAllDetails(@RequestBody BloodBankModel  bloodBankModel){
        return staffService.updateBloodBankAllDetails(bloodBankModel);
    }

    @PostMapping("/updateBloodDonationAllDetails")
    public ResponseEntity updateBloodDonationAllDetails(@RequestBody BloodDonationModel bloodDonationModel){
        return staffService.updateBloodDonationAllDetails(bloodDonationModel);
    }

    @PostMapping("/deleteStaffById/{staffId}")
    public ResponseEntity deleteStaffById(@PathVariable ("staffId") Long staffId){
        return staffService.deleteStaffById(staffId);
    }

    @PostMapping("/deleteDonorById/{donorId}")
    public ResponseEntity deleteDonorById(@PathVariable ("donorId") Long donorId){
        return staffService.deleteDonorById(donorId);
    }

    @PostMapping("/deleteBloodBankById/{bloodBankId}")
    public ResponseEntity deleteBloodBankById(@PathVariable ("bloodBankId")Long bloodBankId){
        return staffService.deleteBloodBankById(bloodBankId);
    }

    @GetMapping("/getBloodBankAllDetails")
    public List<BloodBankModel> getBloodBankAllDetails(){
        return staffService.getBloodBankAllDetails();
    }

    @GetMapping("/getBloodDonationAllDetails")
    public List<BloodDonationModel> getBloodDonationAllDetails(){
        return staffService.getBloodDonationAllDetails();
    }

    @GetMapping("/getBloodTransferDetails")
    public List<BloodTransferModel> bloodTransferModelList (){
        return staffService.getBloodTransferDetails();
    }

    @GetMapping("/getDonorDetails")
    public List<DonorModel> getDonorDetails (){
        return staffService.getDonorDetails();
    }

    @GetMapping("/getStaffDetails")
    public List<StaffModel> getStaffDetails(){
        return staffService.getStaffDetails();
    }
}
