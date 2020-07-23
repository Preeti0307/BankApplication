package com.preeti.bank.model;

public class Customer {
	String custName;
	String emailId;
	
	public Customer() {
		
	}
	
	public Customer(String custName, String emailId){
		this.custName = custName;
		this.emailId = emailId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}