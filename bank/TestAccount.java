package week1.day3.assignment5.bank;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int accountNumber;
		String accountName;
		float accountBalance;
		double rateOfInt;
		
		System.out.println("Name for saving account?");
		accountName = in.next();
		
		System.out.println("Acc # for saving account?");
		accountNumber = in.nextInt();
		
		System.out.println("Balance for savings account?");
		accountBalance = in.nextFloat();
		
		System.out.println("rate of interest for saving account?");
		rateOfInt = in.nextDouble();
		
		Saving savingsAccount = new Saving (accountNumber, accountName, accountBalance, rateOfInt);
		System.out.println("Account name: " + savingsAccount.getAccountName());
		System.out.println("Account number: " + savingsAccount.getAccountNumber());
		System.out.println("Account balance: " + savingsAccount.getAccountBalance());
		System.out.println("Interest rate: " + savingsAccount.getRateOfInt());
		
		// AGAIN
		
		System.out.println("Name for \"current\" account?");
		accountName = in.next();
		
		System.out.println("Acc # for \"current\" account?");
		accountNumber = in.nextInt();
		
		System.out.println("Balance for \"current\" account?");
		accountBalance = in.nextFloat();
		
		System.out.println("rate of interest for \"current\" account?");
		rateOfInt = in.nextDouble();
		
		Current currentAccount = new Current (accountNumber, accountName, accountBalance, rateOfInt);
		System.out.println("Account name: " + currentAccount.getAccountName());
		System.out.println("Account number: " + currentAccount.getAccountNumber());
		System.out.println("Account balance: " + currentAccount.getAccountBalance());
		System.out.println("Interest rate: " + currentAccount.getRateOfInt());
		
		in.close();
	}
}
