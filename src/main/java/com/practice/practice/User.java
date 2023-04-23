package com.practice.practice;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
@Embeddable
public class User{
	@JsonFormat(pattern="yyyy-mm-dd")
	@Column(name="dob1")
	private Date dob1;
	@JsonFormat(pattern="yyyy-mm-dd hh:mm:ss")
	@Column(name="dob2")
	private Date dob2;
	
     public User() {
		
	}
	public Date getDob1() {
		return dob1;
	}
	public void setDob1(Date dob1) {
		this.dob1 = dob1;
	}
	public Date getDob2() {
		return dob2;
	}
	public void setDob2(Date dob2) {
		this.dob2 = dob2;
	}
}
