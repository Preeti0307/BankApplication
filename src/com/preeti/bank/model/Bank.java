package com.preeti.bank.model;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	private Map<String, Account> accountList = new HashMap<String, Account>();

	public Bank() {
		
	}

	public void addAccount(String accNo, String custName, String emailId, double initialAmount) {
		Customer customer = new Customer(custName, emailId);
		Account account = new Account(accNo, customer, initialAmount);
		accountList.put(accNo, account);
	}

	public Account getAccount(String emailId) {
		for (Account account : accountList.values()) {
			if(emailId.equals(account.getCustomer().getEmailId()))
				return account;
		}
		return null;
	}
}