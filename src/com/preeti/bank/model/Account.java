package com.preeti.bank.model;

import java.util.Map;

public class Account {
	private String accNo;
	private double balance;
	private Customer customer;
	private Map<String, Transactions> transactions;
	
	public Account() {
		
	}

	public Account(String accNo, double balance, Customer customer, Map<String, Transactions> transactions) {
		this.accNo = accNo;
		this.balance = balance;
		this.customer = customer;
	}

	public Account(String accNo, Customer customer, double balance) {
		this.accNo = accNo;
		this.customer = customer;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
