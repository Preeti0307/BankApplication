package com.preeti.bank.model;

public class Account {
	private int accNo;
	private double balance;
	private String custName;
	private Transactions transaction;
	private  static int noOfAccounts = 0;
	
	public Account(String custName, double balance) {
		this.custName = custName;
		this.balance = balance;
		noOfAccounts ++;
        accNo = noOfAccounts;
	}

	public int getAccountNum() {
		return accNo;
	}
	
	public void deposit(double amount, int accNo) {
		
	}
	
	public void withDraw(double amount, int accNo) {
		
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
}
