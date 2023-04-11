package com.blood.bloodmanagementsystem.services;

import com.blood.bloodmanagementsystem.entities.*;
import com.blood.bloodmanagementsystem.models.*;
import com.blood.bloodmanagementsystem.repositories.*;
import com.blood.bloodmanagementsystem.utility.DateUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {
    @Autowired
    StaffRepository staffRepository;
    @Autowired
    DonorRepository donorRepository;

    @Autowired
    BloodBankRepository bloodBankRepository;

    @Autowired
    BloodDonationRepository bloodDonationRepository;
    @Autowired
    BloodTransferRepository bloodTransferRepository;
    @Autowired
    EntityManager entityManager;

    @Transactional
    public ResponseEntity saveStaffAllDetails(StaffModel staffModel) {
        Staff staff = new Staff();
        staff.setStaffName(staffModel.getStaffName());
        staff.setAddress(staffModel.getAddress());
        staff.setStaffMobileNumber(staffModel.getStaffMobileNumber());
        staff.setBloodType(staffModel.getBloodType());
        staff.setHospitalName(staffModel.getHospitalName());
        staff.setRequireDate(DateUtility.getCurrentDate());
        staff.setDoctorName(staffModel.getDoctorName());
        staffRepository.save(staff);

        return new ResponseEntity<>("Staff Records Saved", HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity saveDonorAllDetails(DonorModel donorModel) {
        Donor donor = new Donor();
        donor.setDonorAddress(donorModel.getDonorAddress());
        donor.setDonorName(donorModel.getDonorName());
        donor.setDonorBloodType(donorModel.getDonorBloodType());
        donor.setDonorMobileNumber(donorModel.getDonorMobileNumber());
        donor.setLastDonationDate(donorModel.getLastDonationDate());

        donorRepository.save(donor);

        return new ResponseEntity<>("Donors All Records Saved", HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity saveBloodBankAllDetails(BloodBankModel bloodBankModel) {
        BloodBank bloodBank = new BloodBank();
        bloodBank.setBloodBankName(bloodBankModel.getBloodBankName());
        bloodBank.setBloodBankAddress(bloodBankModel.getBloodBankAddress());

        bloodBankRepository.save(bloodBank);

        return new ResponseEntity<>("Blood Bank Details All Saved", HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity saveBloodDonationAllDetails(BloodDonationModel bloodDonationModel) {
        BloodDonation bloodDonation = new BloodDonation();
        bloodDonation.setBloodBankId(bloodDonationModel.getBloodBankId());
        bloodDonation.setDonorId(bloodDonationModel.getDonorId());
        bloodDonation.setBloodDonationDate(DateUtility.getCurrentDate());
        bloodDonation.setBloodType(bloodDonationModel.getBloodType());

        bloodDonationRepository.save(bloodDonation);

        return new ResponseEntity<>("Blood Donation All Details Saved", HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity saveBloodTransferAllDetails(BloodTransferModel bloodTransferModel) {
        BloodTransfer transfer = new BloodTransfer();
        transfer.setBloodBankId(bloodTransferModel.getBloodBankId());
        transfer.setStaffId(bloodTransferModel.getStaffId());
        transfer.setDonorId(bloodTransferModel.getDonorId());
        transfer.setBloodTransferDate(DateUtility.getCurrentDate());
        transfer.setBloodType(bloodTransferModel.getBloodType());

        bloodTransferRepository.save(transfer);
        return new ResponseEntity<>("Blood Transfer All Details Saved", HttpStatus.OK);

    }

    @Transactional
    public ResponseEntity updateStaffAllRecordsDetails(StaffModel staffModel) {
        entityManager.createNativeQuery("update bloodmanagementsystem.staff set address =:address ,  blood_type =:blood_type , doctor_name =:doctor_name , hospital_name =:hospital_name , staff_mobile_number =:staff_mobile_number , require_date = :require_date, staff_name =:staff_name  where staff_id =:staff_id ")
                .setParameter("require_date",staffModel.getRequireDate())
                .setParameter("address", staffModel.getAddress())
                .setParameter("blood_type",staffModel.getBloodType())
                .setParameter("doctor_name", staffModel.getStaffName())
                .setParameter("hospital_name", staffModel.getHospitalName())
                .setParameter("staff_mobile_number", staffModel.getStaffMobileNumber())
                .setParameter("staff_name",staffModel.getStaffName())
                .setParameter("staff_id",staffModel.getStaffId()).executeUpdate();
        return new ResponseEntity<>("All Deta Updated Staff Records",HttpStatus.OK);
    }
    @Transactional
    public ResponseEntity updateDonorAllDetails(DonorModel donorModel) {
        entityManager.createNativeQuery("update bloodmanagementsystem.donor set donor_address = :donor_address , donor_blood_type =:donor_blood_type , donor_mobile_number =:donor_mobile_number , donor_name =:donor_name  where donor_id =:donor_id ")
                .setParameter("donor_address",donorModel.getDonorAddress())
                .setParameter("donor_blood_type",donorModel.getDonorBloodType())
                .setParameter("donor_mobile_number", donorModel.getDonorMobileNumber())
                .setParameter("donor_name", donorModel.getDonorName())
                .setParameter("donor_id",donorModel.getDonorId()).executeUpdate();
        return  new ResponseEntity<>("Donor details All Updated",HttpStatus.OK);

    }

    @Transactional
    public ResponseEntity updateBloodBankAllDetails(BloodBankModel bloodBankModel) {
        entityManager.createNativeQuery("update bloodmanagementsystem.blood_bank set blood_bank_address =:blood_bank_address , blood_bank_name =:blood_bank_name  where blood_bank_id =:blood_bank_id ")
                .setParameter("blood_bank_address",bloodBankModel.getBloodBankAddress())
                .setParameter("blood_bank_name", bloodBankModel.getBloodBankName())
                .setParameter("blood_bank_id", bloodBankModel.getBloodBankId()).executeUpdate();
        return new ResponseEntity<>("Updated BloodBank Details",HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity updateBloodDonationAllDetails(BloodDonationModel bloodDonationModel) {
        entityManager.createNativeQuery("update bloodmanagementsystem.blood_donation set blood_bank_id =:blood_bank_id , blood_type =:blood_type , donor_id =:donor_id  where blood_donation_id =:blood_donation_id ")
                .setParameter("blood_bank_id",bloodDonationModel.getBloodBankId())
                .setParameter("blood_type",bloodDonationModel.getBloodType())
                .setParameter("donor_id",bloodDonationModel.getDonorId())
                .setParameter("blood_donation_id",bloodDonationModel.getBloodDonationId()).executeUpdate();
        return new ResponseEntity<>("Updated BloodDonation All Details",HttpStatus.OK);
    }


    public ResponseEntity deleteStaffById(Long staffId) {
        staffRepository.deleteById(staffId);
        return new ResponseEntity<>("Staff Details Deleted",HttpStatus.OK);
    }


    public ResponseEntity deleteDonorById(Long donorId) {
        donorRepository.deleteById(donorId);
        return new ResponseEntity<>("delete Donor All Details",HttpStatus.OK);
    }


    public ResponseEntity deleteBloodBankById(Long bloodBankId) {
        bloodBankRepository.deleteById(bloodBankId);
        return new ResponseEntity<>("Deleted Blood Bank All Details", HttpStatus.OK);
    }

    public List<BloodBankModel> getBloodBankAllDetails() {
        List<BloodBankModel> bloodBankModelList = new ArrayList<>();
        List<BloodBank> bloodBankList = bloodBankRepository.findAll();
        bloodBankList.stream().forEach(data->{
            BloodBankModel model = new BloodBankModel();
            model.setBloodBankName(data.getBloodBankName());
            model.setBloodBankAddress(data.getBloodBankAddress());
            model.setBloodBankId(data.getBloodBankId());

            bloodBankModelList.add(model);

        });
        return bloodBankModelList;
    }

    public List<BloodDonationModel> getBloodDonationAllDetails() {
        List<BloodDonationModel> bloodDonationModelList = new ArrayList<>();
        List<BloodDonation> bloodDonationList = bloodDonationRepository.findAll();
        bloodDonationList.stream().forEach(data->{
            BloodDonationModel model = new BloodDonationModel();
            model.setBloodBankId(data.getBloodBankId());
            model.setBloodType(data.getBloodType());
            model.setDonorId(data.getDonorId());
            model.setBloodDonationId(data.getBloodDonationId());

            bloodDonationModelList.add(model);

        });
        return bloodDonationModelList;
    }

    public List<BloodTransferModel> getBloodTransferDetails() {
        List<BloodTransferModel> bloodTransferModelList = new ArrayList<>();
        List<BloodTransfer> bloodTransferList = bloodTransferRepository.findAll();
        bloodTransferList.stream().forEach(data->{
            BloodTransferModel model= new BloodTransferModel();
            model.setBloodBankId(data.getBloodBankId());
            model.setBloodTransferId(data.getBloodTransferId());
            model.setStaffId(data.getStaffId());
            model.setBloodType(data.getBloodType());
            model.setDonorId(data.getDonorId());

            bloodTransferModelList.add(model);
        });
        return bloodTransferModelList;
    }

    public List<DonorModel> getDonorDetails() {
        List<DonorModel> donorModelList = new ArrayList<>();
        List<Donor> donorList = donorRepository.findAll();
        donorList.stream().forEach(data->{
            DonorModel model = new DonorModel();
            model.setDonorId(data.getDonorId());
            model.setDonorAddress(data.getDonorAddress());
            model.setDonorName(data.getDonorName());
            model.setDonorBloodType(data.getDonorBloodType());
            model.setDonorMobileNumber(data.getDonorMobileNumber());
            model.setLastDonationDate(data.getLastDonationDate());

            donorModelList.add(model);
        });
        return donorModelList;
    }

    public List<StaffModel> getStaffDetails() {
        List<StaffModel> staffModelList = new ArrayList<>();
        List<Staff> staffList = staffRepository.findAll();
        staffList.stream().forEach(data->{
            StaffModel model = new StaffModel();
            model.setStaffId(data.getStaffId());
            model.setAddress(data.getAddress());
            model.setStaffName(data.getStaffName());
            model.setBloodType(data.getBloodType());
            model.setDoctorName(data.getDoctorName());
            model.setHospitalName(data.getHospitalName());
            model.setRequireDate(data.getRequireDate());
            model.setStaffMobileNumber(data.getStaffMobileNumber());


            staffModelList.add(model);
        });
        return staffModelList;
    }
}
