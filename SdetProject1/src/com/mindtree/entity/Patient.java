package com.mindtree.entity;

import java.util.Date;

public class Patient {

	private int P_ID;
	private String name;
	private String email;
	private String phone;
	private Date DOB;
	
	public Patient()
	{
		
	}
	public Patient(int p_ID, String name, String email, String phone, Date dOB) {
		super();
		P_ID = p_ID;
		this.name = name;
		this.email = email;
		this.phone = phone;
		DOB = dOB;
	}
	public int getP_ID() {
		return P_ID;
	}
	public void setP_ID(int p_ID) {
		P_ID = p_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	
}
