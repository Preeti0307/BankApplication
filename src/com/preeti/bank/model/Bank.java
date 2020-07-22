package com.preeti.bank.model;

public class Bank {
	private Account[] accounts;
	private int numOfAccounts;
	
	public Bank() {
	    accounts = new Account[100];
	    numOfAccounts = 0;
	    }
	
	public int addAccount(String custName, double initialAmount) {
		Account acc = new Account(custName, initialAmount);
		accounts[numOfAccounts] = acc;
	    numOfAccounts++;
	    acc.setCustName(custName);
	    return acc.getAccountNum();
	}
}