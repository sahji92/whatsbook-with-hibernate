package com.in28minutes.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MOBILENUMBER")
	private String mobileNumber;
	
	@Column(name="FULLNAME")
	private String fullName;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="GENDER")
	private String gender;
	
	public User() {
		
	}

	
	
	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber=mobileNumber;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	
		
}





