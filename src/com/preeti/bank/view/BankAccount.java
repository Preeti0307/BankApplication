package com.preeti.bank.view;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.preeti.bank.model.Account;
import com.preeti.bank.model.Bank;

public class BankAccount {

	public static void main(String[] args) {
		Bank bank = new Bank();

		char option = '\0';
		Scanner sc = new Scanner(System.in);
		Consumer<String> firstOption = createAccount -> System.out.println(createAccount);
		firstOption.accept("1: Create Account");
		Consumer<String> secondOption = deleteAccount -> System.out.println(deleteAccount);
		secondOption.accept("2: Account Deletion");
		Consumer<String> thirdOption = amountWithdrawal -> System.out.println(amountWithdrawal);
		thirdOption.accept("3: Withdraw Amount");
		Consumer<String> fourthOption = amountDeposit -> System.out.println(amountDeposit);
		fourthOption.accept("4: Deposit Amount");
		Consumer<String> fifthOption = balanceCheck -> System.out.println(balanceCheck);
		fifthOption.accept("5: Balance Check");
		Consumer<String> sixthOption = bankStatement -> System.out.println(bankStatement);
		sixthOption.accept("6: Bank Statement");

		do {
			System.out.println();
			System.out.println("*****************************");
			System.out.println("Enter an option");
			System.out.println("*****************************");
			option = sc.next().charAt(0);

			switch (option) {
			case '1': {
				System.out.println("*****************************");
				System.out.println("Enter Customer name:");
				String custName = sc.next();
				System.out.println("Initial deposit amount");
				double initialAmount = sc.nextDouble();
				System.out.println("Email Id");
				String emailId = sc.next();

				Supplier<String> s = () -> {
					String accNo = "";
					for(int i=0; i<6; i++) {
						accNo = accNo + (int)(Math.random()*10);
					}
					return accNo;
				};

				String accNo = s.get();
				System.out.println("accNo: "+accNo);

				Predicate<Account> p = a -> a !=null;
				
				Account acc = bank.getAccount(emailId);
				if(p.test(acc)) {
					System.out.println("User already exsits with Account number: "+acc.getAccNo());
				} else {
					bank.addAccount(accNo, custName, emailId, initialAmount);
					System.out.println("Account created successfully with Account number: "+accNo);
				}
			}
			}
		} while (option>=7);
	}

}
