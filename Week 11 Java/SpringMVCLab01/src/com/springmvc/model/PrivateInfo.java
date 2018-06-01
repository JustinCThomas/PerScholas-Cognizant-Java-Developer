package com.springmvc.model;

import java.util.Date;

public class PrivateInfo {
	private Long ssn;
	private Long ccn;
	private Date dob;
	
	
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public Long getCcn() {
		return ccn;
	}
	public void setCcn(Long ccn) {
		this.ccn = ccn;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
