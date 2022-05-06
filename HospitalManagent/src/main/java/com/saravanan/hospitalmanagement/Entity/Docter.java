package com.saravanan.hospitalmanagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Docter")
public class Docter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Doctername", nullable = false)
	private String doctername;
	@Column(name = "Department")
	private String department;
	@Column(name = "Shift")
	private String shift;
	@Column(name = "Number")
	private String number;
	@Column(name = "Place")
	private String place;
	@Override
	public String toString() {
		return "Docter [id=" + id + ", doctername=" + doctername + ", department=" + department + ", shift=" + shift
				+ ", number=" + number + ", place=" + place + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDoctername() {
		return doctername;
	}
	public void setDoctername(String doctername) {
		this.doctername = doctername;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Docter(Long id, String doctername, String department, String shift, String number, String place) {
		super();
		this.id = id;
		this.doctername = doctername;
		this.department = department;
		this.shift = shift;
		this.number = number;
		this.place = place;
	}
	public Docter() {
		// TODO Auto-generated constructor stub
	}
}

	


