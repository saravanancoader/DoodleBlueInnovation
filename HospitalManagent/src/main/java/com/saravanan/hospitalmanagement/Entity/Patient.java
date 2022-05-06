package com.saravanan.hospitalmanagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patid;
	
	private String patientname;
	private String patientnumber;
	private String problem;
	private String  patientemail;
	private String patientplace;
	private String patienttype;
	private String patientfees;
	
	public Patient(Long patid, String patientname, String patientnumber, String problem, String patientemail,
			String patientplace, String patienttype, String patientfees) {
		super();
		this.patid = patid;
		this.patientname = patientname;
		this.patientnumber = patientnumber;
		this.problem = problem;
		this.patientemail = patientemail;
		this.patientplace = patientplace;
		this.patienttype = patienttype;
		this.patientfees = patientfees;
	}
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	public Long getPatid() {
		return patid;
	}
	public void setPatid(Long patid) {
		this.patid = patid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getPatientnumber() {
		return patientnumber;
	}
	public void setPatientnumber(String patientnumber) {
		this.patientnumber = patientnumber;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getPatientemail() {
		return patientemail;
	}
	public void setPatientemail(String patientemail) {
		this.patientemail = patientemail;
	}
	public String getPatientplace() {
		return patientplace;
	}
	public void setPatientplace(String patientplace) {
		this.patientplace = patientplace;
	}
	public String getPatienttype() {
		return patienttype;
	}
	public void setPatienttype(String patienttype) {
		this.patienttype = patienttype;
	}
	public String getPatientfees() {
		return patientfees;
	}
	public void setPatientfees(String patientfees) {
		this.patientfees = patientfees;
	}
	}


