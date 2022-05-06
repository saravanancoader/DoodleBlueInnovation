package com.saravanan.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.saravanan.hospitalmanagement.Entity.Docter;
import com.saravanan.hospitalmanagement.Entity.Patient;

import com.saravanan.hospitalmanagement.service.Hospitalmanagementservice;


@Controller
public class Hospitalcontroller {
	
	
@Autowired
Hospitalmanagementservice hostservice;
	

	@GetMapping("patient/new")	
	public String createstudentmarks(Model model) {
		Patient patient=new Patient();
		model.addAttribute("patient",patient);
		return "createpatient";
		
	}

	@PostMapping("/savepatient")
	public String saveStudent(@ModelAttribute("patient") Patient patient) {
	 
	hostservice.savepatient(patient);
	
	return "adminsucces";
	}
@GetMapping("/home")
public String home() {
	
	return "adminsucces";
}
	
@GetMapping("/back")
public String back() {
	
	return "adminsucces";
}
	


@GetMapping("docter/new")	
public String docternew(Model model) {
	Docter docter=new Docter();
	model.addAttribute("docter",docter);
	return "createdocter";
	
}
	
@PostMapping("/savedocter")
public String saveStudent(@ModelAttribute("docter") Docter docter) {
 
hostservice.savedocter(docter);

return "adminsucces";
}
@GetMapping("/docterlist")
public String listdocter(Model model) {
	model.addAttribute("docterlist",hostservice.getAlldocter());
	
      return "docterlist";

}
@GetMapping("/deletedoc/{id}")
	public String deleteStudent(@PathVariable Long id) {
        hostservice.deletedocter(id);
	   return "redirect:/docterlist";
}

@GetMapping("/docter/edit/{id}")
public String docteredit(@PathVariable Long id, Model model) {
	model.addAttribute("doctar",hostservice.getdocterbyid(id));
	System.out.println(hostservice.getdocterbyid(id));
	return "editdocter";
  }
@PostMapping("/doctor/{id}")
public String docterupdate(@PathVariable Long id,
		@ModelAttribute("docter") Docter docter,
		Model model) {


	 Docter existingStudent = hostservice.getstudentbyid(id);
	existingStudent.setId(id);
	existingStudent.setDoctername(docter.getDoctername());
	existingStudent.setDepartment(docter.getDepartment());
	existingStudent.setNumber(docter.getNumber());
	existingStudent.setPlace(docter.getPlace());
	existingStudent.setShift(docter.getShift());

	
	hostservice.updatedocter(existingStudent);
	return "redirect:/docterlist";		
}

//-----------------------------------------------------
@GetMapping("/patient/edit/{id}")
public String editpatient(@PathVariable Long id, Model model) {
	model.addAttribute("patient", hostservice.patientbyid(id));
	return "editpatient";
  }
@PostMapping("/patients/{id}")
public String updateStudent(@PathVariable Long id,
		@ModelAttribute("patient") Patient patient,
		Model model) {


	Patient existingStudent = hostservice.getpatientbyid(id);
	existingStudent.setPatid(id);
	existingStudent.setPatientname(patient.getPatientname());
	existingStudent.setPatientemail(patient.getPatientemail());
	existingStudent.setPatientnumber(patient.getPatientnumber());
	existingStudent.setPatientplace(patient.getPatientnumber());
	existingStudent.setPatientfees(patient.getPatientfees());

	
	hostservice.updatepatient(existingStudent);
	return "redirect:/patientlist";		
}









@GetMapping("/patientlist")
public String listpatient(Model model) {
	model.addAttribute("patientlist",hostservice.getAllpatients());
	System.out.println(hostservice.getAllpatients());
	
      return "patientlist";

}

	


@GetMapping("/patientdelete/{id}")
public String deletepat(@PathVariable Long id) {
    hostservice.deletepatid(id);
   return "redirect:/patientlist";
}
/*
 * @PostMapping("/count") public int countdocter() {
 * 
 * 
 * hostservice.count();
 * 
 * }
 */
}