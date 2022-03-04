package org.kiot.bank;

import org.kiot.bankaccount.BankAccount;
/**
 *	Bank class retrieves account holder details
 *	@version 04/03/2022
 *  @author praveen kandhan
 */

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount1 = new BankAccount("123456789","praveen",1000);
		BankAccount bankAccount2 = new BankAccount("123", "arun");
		System.out.print("bankAccount1  Details:\n" 
				+ "accno: " + bankAccount1.getAccountNo()
				+ "\naccholdername: " + bankAccount1.getAccountName()
				+ "\nbalance " + bankAccount1.getBalance());
	}

}
