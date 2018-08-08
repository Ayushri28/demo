package entity;

import java.sql.Date;

public class Patient {

	
	
	private int pID;
	private String name;
	private String email;
	private String phone;
	private Date dob;
	
	  public  Patient()
	{
		pID=0;
		name=null;
		email=null;
		phone=null;
		dob=null;
		
		
	}

	public Patient(int pID, String name, String email, String phone, Date dob) {
		super();
		this.pID = pID;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
}
