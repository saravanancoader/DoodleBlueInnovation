package com.saravanan.hospitalmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saravanan.hospitalmanagement.Entity.Docter;
import com.saravanan.hospitalmanagement.Entity.Patient;

import com.saravanan.hospitalmanagement.Entity.User;
import com.saravanan.hospitalmanagement.Repository.Docterrepository;
import com.saravanan.hospitalmanagement.Repository.patientrepository;
import com.saravanan.hospitalmanagement.Repository.userrepository;

@Service
public class Hospitalmanagementservice {

	@Autowired
	patientrepository patientrepo;
	@Autowired
	 userrepository userrepository;
	
	@Autowired
	Docterrepository docresp;
	
	
	public void savepatient(Patient patient) {
		patientrepo.save(patient);
	
	
	}



	public void savedocter(Docter docter) {
	docresp.save(docter);
		
	}



public List<Docter> getAlldocter() {
		
		return docresp.findAll();
	}

	
	
public List<Patient> getAllpatients() {
	
	return patientrepo.findAll();
}



public void deletedocter(Long id) {
	docresp.deleteById(id);
}



public Docter getstudentbyid(Long id) {
	// TODO Auto-generated method stub
	
	return docresp.findById(id).get(); 
}

	
public Patient patientbyid(Long id) {
	// TODO Auto-generated method stub
	
	return patientrepo.findById(id).get(); 
}



public  Docter updatedocter(Docter existingStudent) {
     
	
	return docresp.save(existingStudent);
}



public Patient getpatientbyid(Long id) {
	// TODO Auto-generated method stub
	return patientrepo.findById(id).get();
}



public Patient updatepatient(Patient existingStudent) {
	// TODO Auto-generated method stub
	return patientrepo.save(existingStudent);
}



public Docter getdocterbyid(Long id) {
	
	return docresp.findById(id).get();
}



public void deletepatid(Long id) {
  patientrepo.deleteById(id);	
}



public void saveaddmin(User user) {
	
	userrepository.save(user);
}







	
	
	
	
	
	
	
	
	
}
