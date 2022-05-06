package com.saravanan.hospitalmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saravanan.hospitalmanagement.Entity.Patient;
@Repository
public interface patientrepository extends JpaRepository<Patient, Long> {
	
	

}
